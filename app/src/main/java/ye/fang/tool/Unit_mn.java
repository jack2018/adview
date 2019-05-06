package ye.fang.tool;



public class Unit_mn{

    public static String  int_unit(int i){


        String unit = null;
        if(i==1){
            unit="kg";
        }

        if(i==2){

            unit="�?";
        }
        if(i==3){

            unit="�?";
        }
        if(i==4){

            unit="g";
        }
        if(i==5){

            unit="ton";
        }
        if(i==6){

            unit="b";
        }
        if(i==7){

            unit="�?";
        }

        if(i==20){
            unit="�?";
        }
        if(i==22){
            unit="�?";
        }

        if(i==23){
            unit="�?";
        }
        if(i==24){
            unit="�?";
        }

        if(i==25){
            unit="�?";
        }
        if(i==26){
            unit="�?";
        }

        if(i==27){
            unit="�?";
        }
        if(i==28){
            unit="�?";
        }
        if(i==29){
            unit="�?";
        }
        if(i==30){
            unit="�?";
        }

        return unit;
    }
    public static boolean we=true;
    public static boolean  we_judge(String  st){

        if(st.equals("kg")){
            we=true;
        }
        else we=false;
        return we;
    }

}
