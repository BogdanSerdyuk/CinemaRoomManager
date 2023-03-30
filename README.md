This is the *Cinema Room Manager* project I made myself.


This Java program is a cinema ticket booking system. It allows the user to choose the number of rows and seats per row in the cinema hall, and then it displays a menu to the user to book tickets, view the seating arrangement, and view the ticket sales statistics.

The program is divided into four classes: Cinema, Menu, TextUI, and TicketPrice.

The Cinema class has the main method which is the entry point of the program. It prompts the user to enter the number of rows and seats per row, creates an instance of the Menu class with these parameters and then calls the start method on this instance.

The Menu class is responsible for displaying the menu, booking tickets, and displaying ticket statistics. It has an instance of the TextUI class, which is responsible for displaying the seating arrangement, and an instance of the TicketPrice class, which is responsible for calculating ticket prices. The start method displays a menu to the user, and based on the user's choice, it calls the appropriate method to book a ticket, display seating arrangement, or display ticket statistics. The buyingTicket method is used to book a ticket, and it asks the user to enter the row and seat number. If the user enters invalid input, the program displays an error message. Otherwise, it books the ticket and updates the ticket statistics. The callStatistics method displays ticket statistics, including the number of purchased tickets, the percentage of seats sold, the current income, and the total possible income.

The TextUI class is responsible for displaying the seating arrangement of the cinema hall. It has a two-dimensional array of characters, where 'S' represents a free seat and 'B' represents a booked seat. The setSeatsArray method initializes this array to all 'S'. The printRoom method prints the seating arrangement to the console.

The TicketPrice class is responsible for calculating ticket prices. It has two fields, defaultPrice and discountedPrice, which are the prices for a single seat. The getTotalSeats method calculates the total number of seats in the cinema hall. The calculatePriceOfTicket method calculates the price of a ticket based on the row number. If the number of seats in the cinema hall is less than 60, then the ticket price is defaultPrice. Otherwise, the ticket price is defaultPrice for the first half of the rows and discountedPrice for the second half.

JetBrains academy profile: https://hyperskill.org/profile/396402561
