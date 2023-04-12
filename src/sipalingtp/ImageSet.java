/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sipalingtp;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author fadhl
 */
public class ImageSet {
    private String path;
    private File fileImg;
    private ImageIcon img;
    public ImageSet(){
    }
    
    public void cari()
    {
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png","jpeg","bmp","webp");
        file.addChoosableFileFilter(filter);
        file.setAcceptAllFileFilterUsed(false);
        int res = file.showOpenDialog(null);
        if(res == JFileChooser.APPROVE_OPTION){
          this.fileImg = file.getSelectedFile();
          this.path =  fileImg.getName();
        }
    }

    public void resize()
    {
      ImageIcon l_path = new ImageIcon(this.path);
      Image l_img = l_path.getImage();
      Image newImg = l_img.getScaledInstance(151, 150, Image.SCALE_SMOOTH);
      ImageIcon image = new ImageIcon(newImg);
      this.img = image;
    }
    public String getPath(){
        return this.path;
    }
    public File getFile(){
        return this.fileImg;
    }
    public ImageIcon getImg(){
        return this.img;
    }
}