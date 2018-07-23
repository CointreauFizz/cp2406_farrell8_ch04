class FixDebugBox
{
   private int width;
   private int length;
   private int height;

   FixDebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   {
     System.out.println("Width: "  + width + "  Length: " +
       length + "  Height: " + height);
   }
   double getVolume()
   {
      return (double) (length * width * height);
   }
}
