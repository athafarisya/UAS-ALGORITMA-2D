package MODEL;

import java.util.ArrayList;

public class PokemonGo {
    private String[] data;

    public void setData(String[] data){
        this.data = data;
    }
    private class ArrayListModel(){
    }
        private String Bug;
        private String Dark;
        private String Dragon;
        private String Electric;
        private String Fairy;
    
    public String PokemonGo(String bug,String dark,String dragon,String electric,String fairy){
        this.Bug = bug;
        this.Dark = dark;
        this.Dragon = dragon;
        this.Electric = electric;
        this.Fairy = fairy;
    }
    public String getBug(){
        return this.Bug;
    }
    public void setBug(String bug){
        this.Bug = bug;
    }
    public String getDark(){
        return this.Dark;
    }
    public void setDark(String dark){
        this.Dark = dark;
    }
    public String getDragon(){
        return this.Dragon;
    }
    public void setDragon(String dragon){
        this.Dragon = dragon;
    }
    public String getElectric(){
        return this.Electric;
    }
    public void setElectric(String electric){
        this.Electric = electric;
    }
    public String getFairy(){
        return this.Fairy;
    }
    public void setFairy(String fairy){
        this.Fairy = fairy;
    }
    public static void main(String[] args) {
        String[] dataArrayListString = {"Bug","Dark","Dragon","Electric","Fairy"};
        String n = dataArrayListString.toString();
        System.out.println("""
                    Before sorting ArrayList elements are -\s""");
        PokemonGo _myPkm = new PokemonGo();
        _myPkm.setData(dataArrayListString);
        System.out.println("\nAfter sorting arraylist elements are -");
    }
}