import { Component } from "react";

export default class AboutScreen extends Component {
  render() {
    return (
      <div>
        <div class="container-fluid" style={{color:'black'}}>
          <div class="row">
            <div class="col-sm-2"></div>
            <div class="col-sm-7">
              <h1>Welcome to Airline Reservation System</h1>
              <p>
                What an About Us page is really for. Communicate the story of
                your business and why you started it. Describe the customers or
                the cause that your business serves. Explain your business model
                or how your products are made. Put a face to your business,
                featuring the founders or the people on your team
              </p>
              <br/>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
