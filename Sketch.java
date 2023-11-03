import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    // Fills section with squares
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 3 + intRow; 
        intY = 300 + 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section2(){
    int intX = 0;
    int intY = 0;
    
    // Fills sections with squares, but alternates between black-white based on the row
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 300 + 3 + intRow;  
        intY = 300 + 3 + intColumn;

        if (intRow % 4 == 0) {
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
        } else {
            fill(0);
            noStroke();
            rect(intX, intY, 5, 5);
        }
      }
    }
  }

  public void draw_section3(){
    int intX = 0;
    int intY = 0;
    boolean isBlack = true;

    // Fills sections with sqaures, but alternates between black-white for each loop 
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 300 + 300 + 3 + intRow;  
        intY = 300 + 3 + intColumn;

        if (isBlack) {
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
          isBlack = false;
        } else {
            fill(255);
            noStroke();
            rect(intX, intY, 5, 5);
            isBlack = true;
        }
      }
    }
  }

  public void draw_section4(){

    int intX = 0;
    int intY = 0;
    boolean isBlack = true;

    // Fills section with squares, but if the row is even, it alternates between white-black
    for(int intRow = 0; intRow < 300; intRow += 10){
      boolean blackRow = intRow % 20 == 10;
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 300 + 300 + 300 + 3 + intRow;  
        intY = 300 + 3 + intColumn;

        if (blackRow) {
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        } else {
            if (isBlack) {
              fill(0);
              noStroke();
              rect(intX, intY, 5, 5);
              isBlack = false;
            }
            
            else {
              fill(255);
              noStroke();
              rect(intX, intY, 5, 5);
              isBlack = true;
            }

        }

      }
    }

  }

  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    // Fills the bottom-right corner of the square
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 300 - intRow; intColumn < 300; intColumn += 10){
        intX = 3 + intRow; 
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    // Fills the bottom-left of the square
    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = intRow; intColumn < 300; intColumn += 10){
        intX = 3 + 300 + intRow; 
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    // Fills the top-left of the square, reversing intY
    for(int intColumn = 300; intColumn >= 0; intColumn -= 10){
      for(int intRow = 0; intRow < intColumn; intRow += 10){
        intX = 3 + 300 + 300 + intRow; 
        intY = 3 + 300 - intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    // Fills the top-right of the square, reversing the column/row loops
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = intColumn; intRow < 300; intRow += 10){
        intX = 3 + 300 + 300 + 300 + intRow; 
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

}
