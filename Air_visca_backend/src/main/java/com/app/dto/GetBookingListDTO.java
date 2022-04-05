package com.app.dto;

import java.time.LocalDate;

public class GetBookingListDTO {
	private int bookingId;
	private LocalDate bookingDate;
	private double totalFare;
	private LocalDate journeyDate;
	private LocalDate arrivalDate;
	private int status;
	private int airlineId;
	private int userId;
	private String airlineName;
	private String userName;
	
	
	public GetBookingListDTO(int bookingId, LocalDate bookingDate, double totalFare, LocalDate journeyDate,
			LocalDate arrivalDate, int status, int airlineId, int userId, String airlineName) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.totalFare = totalFare;
		this.journeyDate = journeyDate;
		this.arrivalDate = arrivalDate;
		this.status = status;
		this.airlineId = airlineId;
		this.userId = userId;
		this.airlineName = airlineName;
	}
	
	
	public GetBookingListDTO(int bookingId, LocalDate bookingDate, double totalFare, LocalDate journeyDate,
			LocalDate arrivalDate, int status, int airlineId, int userId) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.totalFare = totalFare;
		this.journeyDate = journeyDate;
		this.arrivalDate = arrivalDate;
		this.status = status;
		this.airlineId = airlineId;
		this.userId = userId;
	}
	
	


	public GetBookingListDTO(int bookingId, LocalDate bookingDate, double totalFare, LocalDate journeyDate,
			LocalDate arrivalDate, int status, int airlineId, String airlineName, String userName) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.totalFare = totalFare;
		this.journeyDate = journeyDate;
		this.arrivalDate = arrivalDate;
		this.status = status;
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.userName = userName;
	}


	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	public LocalDate getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		return "GetBookingListDTO [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", totalFare=" + totalFare
				+ ", journeyDate=" + journeyDate + ", arrivalDate=" + arrivalDate + ", status=" + status
				+ ", airlineId=" + airlineId + ", userId=" + userId + ", airlineName=" + airlineName + ", userName="
				+ userName + "]";
	}
	
	
	
	
	
}
