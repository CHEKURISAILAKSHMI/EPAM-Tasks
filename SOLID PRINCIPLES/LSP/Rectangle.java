class Rectangle
  {
   protected int width;
      protected int height;
  
      public void setWidth(int width)
      {
          this.width = width;
      }
  
      public void setHeight(int height)
      {
          this.height = height;
      }
  
      public int getWidth()
      {
          return width;
      }
  
      public int getHeight()
      {
          return height;
      }
  
      public int getArea()
      {
          return width * height;
      }
  }
  
  class Square extends Rectangle
  {
      public void setWidth(int width)
      {
          this.width = width;
         this.height = width;
      }
  
     public void setHeight(int height)
      {
          this.width = height;
          this.height = height;
      }
  }
  
  class LSP
  {
      private static Rectangle getNewRectangle()
      {
          return new Square();
      }
  
      public static void main(String args[])
      {
          Rectangle r = LSP.getNewRectangle();
  
          r.setWidth(5);
          r.setHeight(10);
         
        System.out.println(r.getArea());
      }
  }
  