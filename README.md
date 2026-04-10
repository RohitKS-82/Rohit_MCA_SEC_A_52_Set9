Gym Locker Management System

A console based application developed using Core Java and MySQL to manage gym locker assignments efficiently. This project was created as part of a Database Management Systems and Java with JDBC assessment.

Project Overview

This system helps a fitness center manage locker allocation for its members. It eliminates manual tracking issues by maintaining proper records of members and locker usage in a database.

Features
Add new gym members with details like name, phone, and membership plan
Assign available lockers to members
Release lockers when members leave or membership expires
View complete locker status showing occupied and free lockers
Technologies Used
Core Java
JDBC
MySQL
Database Schema

Two tables are used in the system:

members

member_id
name
phone
plan

lockers

locker_id
locker_no
member_id
assigned_on
Project Structure
DBConnection.java
Handles database connection using JDBC
Main.java
Contains menu driven logic and all operations
schema.sql
SQL script to create database and tables
How to Run
Install MySQL and create the database using schema.sql
Update database credentials in DBConnection.java
Compile the Java files
Run the Main class
Use the console menu to perform operations
Sample Operations
Add Member
Assign Locker
Release Locker
View Locker Status
Constraints Followed
Used only Core Java
Used JDBC for database connectivity
Used PreparedStatement for queries
Implemented exception handling using try catch
Console based application without GUI
