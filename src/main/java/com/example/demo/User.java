package com.example.demo;

public class User
{
	private String name;
	private String pass;
	private int id;

	public User()
	{
		this("", "", 0);
	}
	public User(String name, String pass, int id)
	{
		this.name = name;
		this.pass = pass;
		this.id = id;
	}
	@Override
	public String toString()
	{
		return "User [name=" + name + ", pass=" + pass + ", id=" + id + "]";
	}
}
