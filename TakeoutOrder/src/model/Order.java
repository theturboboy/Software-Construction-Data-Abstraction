package model;

public class Order {

    int ticketNumber;
    String customerName;
    boolean completed;
    String instructions;
    char comboId;
    double price;

    public Order(int ticketNumber, char comboId, String customerName) {
        this.ticketNumber = ticketNumber;
        this.comboId = comboId;
        this.customerName = customerName;
        this.price = 9.5;
        this.instructions = "";
    }

    //MODIFIES: this
    //EFFECTS: set instructions
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    //MODIFIES: this
    //EFFECTS: mark order as completed
    public void completed() {
        this.completed = true;
    }

    //EFFECTS: shows if order is completed
    public boolean isCompleted() {
        return this.completed;
    }

    //EFFECTS: returns customer receipt
    public String customerReceipt() {
        return this.customerName + " - " + this.ticketNumber + " - Combo " + this.comboId + " - $" + this.price;
    }

    //EFFECTS: returns customer instructions
    public String cookingInstructions() {
        return this.ticketNumber + " - Combo " + this.comboId + ": " + this.instructions;
    }

    //EFFECTS: returns ticket number
    public int getTicketNumber() {
        return this.ticketNumber;
    }

    //EFFECTS: returns customer name
    public String getCustomerName() {
        return this.customerName;
    }

    //EFFECTS: returns combo Id
    public char getComboId() {
        return this.comboId;
    }

    //EFFECTS: returns price
    public double getPrice() {
        return this.price;
    }

}
