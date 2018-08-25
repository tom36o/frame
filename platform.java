public class platform extends JFrame{
    public static void main(String args[]){
        new platform();
    }
    public platform(){
        this.setSize(400 , 400);
        this.setTitle("this is a platform");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize(); 
        int xpos = (dim.width / 2) - (this.getWidth() / 2);
        int ypos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xpos, ypos);
                // او ممكن تعمل كدا
                        //this.setLocationRelativeTo(null);
        
        
        this.setVisible(true);
    }
}
