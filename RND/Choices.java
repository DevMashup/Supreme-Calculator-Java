package RND;

import Mathematics.*;

public class Choices {
    public void choice(String choice) {
        Basic basic = new Basic();

        if(choice.equals("Add") || choice.equals("add")) {
            basic.Add();
        } else if(choice.equals("Subtract") || choice.equals("Sub") || choice.equals("subtract") || choice.equals("sub")) {
            basic.Subtract();
        }
    }
}
