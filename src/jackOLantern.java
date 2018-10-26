public class jackOLantern extends java.lang.Object {

    private String pattern[][];

    public jackOLantern(String pattern[][])
    {
        this.pattern = pattern;
    }
    public String toString()
    {
        String lantern = "";
        for(int x = 0; x < this.pattern.length; x++)
        {
            for(int i = 0; i <this.pattern[x].length; x++)
            {
                lantern += pattern[x][i];
            }
           lantern += "\n";

        }
        return lantern;
    }
    public void edit(java.lang.String replace, int row, int column)
    {
        this.pattern[row][column] = replace;
    }

    public void fill (java.lang.String str)
    {
        for(int x = 0; x < this.pattern.length;x++)
        {
            for( int i =0; i<this.pattern[x].length;x++)
            {
                this.pattern[x][i] = str;
            }
        }
    }
}
