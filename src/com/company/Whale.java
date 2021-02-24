package com.company;

public class Whale {

    /**
     * There are 3 keywords which define the field/method visibility:
     *  Public: The field/method can be accessed from outside (with the object reference).
     *  Private: The field/method can't be accessed from outside.
     *  Protected: Visible to the classes in the package and to the classes that extend this class.
     */

    //The fields/properties of the class
    protected int length;
    public String type;
    public double weight;
    protected int age;

    //The constructor of the class
    public Whale(int length, String type, double weight){
        this.length = length;
        this.type = type;
        this.weight = weight;
    }

    /**
     * @return Return ture if the weight of the whale is in valid according to its length.
     */
    public boolean isValidWeight(){
        String relativeSize = this.relativeSize();

        if(relativeSize.equals("S")){
            return this.weight > 1;
        } else{
            if(relativeSize.equals("M")){
                return this.weight > 2;
            } else {
                return this.weight > 3;
            }
        }
    }

    /**
     * @return S/M/L according to the whale length.
     */
    private String relativeSize(){
        if(this.length <=10){
            return "S";
        } else{
            if(this.length > 10 & this.length <= 12){
                return "M";
            } else {
                return "L";
            }
        }
    }

    /**
     * @return The length of the whale
     */
    public int getLength() {
        return length;
    }

    /**
     * Set the whale's length only if {@code 0 < length <= 30 }
     * @param length The new length of the whale
     */
    public void setLength(int length) {
        if(length <=0 | length > 30){
            return;
        }
        this.length = length;
    }

    // This method is let the class represent itself by string.
    @Override
    public String toString() {
        return "Whale{" +
                "length=" + length +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }

}
