package com.myself.spring;

public class CombineSetter implements CombineInterfaceSetter {

	private GoodAfternoonGreeting goodAfternoonGreeting;
	private InstructCodeInSpringEnv instructCodeInSpringEnv;
	private String emailAddress;
	private String contact;
	private String emailAddress2;
	private String contact2;

	public String getEmailAddress2() {
		return emailAddress2;
	}

	public void setEmailAddress2(String emailAddress2) {
		this.emailAddress2 = emailAddress2;
	}

	public String getContact2() {
		return contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	private CombineSetter() {
		System.out.println("CombineSetter: Inside no-arg constructor");

	}

	public void setGoodAfternoonGreeting(GoodAfternoonGreeting goodAfternoonGreeting) {
		System.out.println("Inside Setter Method-Good Afternoon");
		this.goodAfternoonGreeting = goodAfternoonGreeting;
	}

	public void setInstructCodeInSpringEnv(InstructCodeInSpringEnv instructCodeInSpringEnv) {
		System.out.println("Inside Setter Method - Instruct Code");
		this.instructCodeInSpringEnv = instructCodeInSpringEnv;

	}

	@Override
	public String goodAfternoon() {
		// TODO Auto-generated method stub
		return goodAfternoonGreeting.getDailyGreetings();
	}

	@Override
	public String getCodeInstruction() {
		// TODO Auto-generated method stub
		return instructCodeInSpringEnv.getInstruction();
	}

}
