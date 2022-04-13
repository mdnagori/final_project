import { useEffect, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { Link } from "react-router-dom";
import { signin } from "../actions/userActions";
import Header from "../components/Header";
// import Footer from '../components/Footer';

const SigninScreen = (props) => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const [emailError, setEmailError] = useState("");
  const [passwordError, setPasswordError] = useState("");
  const userSignin = useSelector((store) => store.userSignin);
  const { loading, error, response } = userSignin;

  const dispatch = useDispatch();
  const onLogin = () => {
    if (!email) setEmailError("Email is required");
    else setEmailError("");
    if (!password) setPasswordError("Password Is Required ");
    else setPasswordError("");
    if (email && password) dispatch(signin(email, password));
  };

  useEffect(() => {
    if (
      response &&
      response.status === "success" &&
      response.data.userRole === "CUSTOMER"
    ) 
    {
     
      console.log(response.data);
      sessionStorage.setItem("user", response.data);
      sessionStorage.setItem("userid", response.data.id);
      sessionStorage.setItem("userRole", response.data.userRole);
      sessionStorage.setItem("firstname",response.data.firstName);
      sessionStorage.setItem("user1",response.data.email);
      // alert(sessionStorage.getItem("user1"));
      props.history.push("/customer/search_flight");
    } else if (
      response &&
      response.status === "success" &&
      response.data.userRole === "ADMIN"
    ) {
      
      sessionStorage.setItem("user", response.data);
      sessionStorage.setItem("userid", response.data.id);
      sessionStorage.setItem("userRole", response.data.userRole);
      props.history.push("/admin");
    } else if (
      response &&
      response.status === "success" &&
      response.data.userRole === "SUPERADMIN"
    ) {
      sessionStorage.setItem("user", response.data);
      sessionStorage.setItem("userid", response.data.id);
      sessionStorage.setItem("userRole", response.data.userRole);
      props.history.push("/superadmin");
    } else if (response && response.status === "error") {
      alert("Login Failed invalid Credentials");
    } else if (error) {
      alert("Login Failed invalid Credentials");
    }
  }, [loading, error, response]);
  return (
    <div className="privacydiv">
      {/* <Header title="Signin" /> */}
      <div className="row justify-content-center">
        <div className="col-md-6 col-lg-5">
          <div className="login-wrap p-4 p-md-5">
            <div className="icon d-flex align-items-center justify-content-center">
              <span className="fa fa-user-o"></span>
            </div>
            <h3 className="text-center mb-4">Have an account?</h3>
            {/* <form action="#" className="login-form"> */}
            <div className="form-group">
              <input
                onChange={(e) => {
                  setEmail(e.target.value);
                }}
                type="email"
                className="form-control rounded-left"
                placeholder="Email"
              />
              <h6 className="text-danger text-center my-4">{emailError}</h6>
            </div>
            <div className="form-group d-flex">
              <input
                onChange={(e) => {
                  setPassword(e.target.value);
                }}
                type="password"
                className="form-control rounded-left my-4"
                placeholder="Password"
                required=""
              />
              <h6 className="text-danger text-center">{passwordError}</h6>
            </div>
            <div><h6 className="float-end">New user<Link to="/signup"><span  > register here</span></Link></h6></div><br/>
            <div className="form-group my-3">
              <button
                onClick={onLogin}
                type="submit"
                className="btn btn-primary rounded submit p-2 px-4"
              >
                Login
              </button>
            </div>
            {/* </form> */}
          </div>
        </div>
      </div>
      
    </div>

  );
};

export default SigninScreen;
