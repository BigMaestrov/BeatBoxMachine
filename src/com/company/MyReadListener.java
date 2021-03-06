package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class MyReadListener implements ActionListener {
    public void actionPerformed(ActionEvent event){
        boolean[] checkBoxState = new boolean[256];

        for(int i = 0;i<256;i++){

            JCheckBox check = (JCheckBox) BeatBox.checkBoxList.get(i);
            if(check.isSelected()){
                checkBoxState[i] = true;
            }

        }
        try{
            FileOutputStream fileStream = new FileOutputStream(new File("CheckBox.ser"));
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(checkBoxState);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

