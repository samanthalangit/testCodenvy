package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
   
    Tortoise.show();
   Tortoise.setSpeed(10);
    for (int j = 0; j< 301; j++) {
    
  

 for (int i = 0; i < 4; i++) {
   Tortoise.setPenWidth(j);
  
 Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(50);

Tortoise.turn(90);
}
      Tortoise.move(j);
      Tortoise.turn(15);
}

  }
}