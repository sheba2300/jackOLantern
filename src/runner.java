public class runner {
    public static void main(String args[])
    {
        String[][] face = new String[4][5];
        jackOLantern jack = new jackOLantern(face);
        jack.fill(" ");
        jack.edit("|", 1,0);
        jack.edit("|", 2,0);
        jack.edit("|", 3,0);
        jack.edit("|", 1,4);
        jack.edit("|", 2,4);
        jack.edit("|", 3,4);
        jack.edit("~", 0,0);
        jack.edit("~", 0,1);
        jack.edit("~", 0,2);
        jack.edit("~", 0,3);
        jack.edit("0", 1,1);
        jack.edit("~", 1,3);
        jack.edit("~", 2,1);
        jack.edit("~", 0,0);










    }

}
