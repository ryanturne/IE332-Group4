
public void setLabel(String label) {
    if (label == null || label.length() == 0) {
        System.out.println("Invalid input. Label is not greater than zero characters");
    } else if (label.length() > 3) {
        this.label = label.substring(0,3);
    } else {
        this.label = label;
    }
}

  