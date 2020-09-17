package vn.techmaster;

import vn.techmaster2.UIControl;

public class TextBox extends UIControl {
   private String text;

   public String getText() {
       return text;
   }

   public void setText(String text) {
        this.text = text;
   }

    @Override
    public String toString() {
        return text;
    }
}
