package weather_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.Timer;

public class Weather_forecast extends javax.swing.JFrame {
// Create a variable fah for fahrenheit and cel for celsius using a double data type for a decimal number 
    int relativeHumidity, wind, tfah, dpfah;

       public Weather_forecast() {
        initComponents();
        closeL();
        closeV();
        closeM();
        
    }
    //to erase the current forecast in a system
    private void erase(){
    jLabel14.setText(" ");
    jLabel15.setText(" ");
    jLabel26.setText(" ");
    jLabel31.setText(" ");
    jLabel24.setText(" ");
    jLabel21.setText(" ");
    LTime.setVisible(false);
    LDate.setVisible(false);
    }
    //to show all the all the location button that part of luzon
    private void openL() {
        jRadioButton31.setVisible(true);
        jRadioButton33.setVisible(true);
        jRadioButton27.setVisible(true);
        jRadioButton28.setVisible(true);
        jRadioButton26.setVisible(true);
        jRadioButton29.setVisible(true);
        jRadioButton35.setVisible(true);
        jRadioButton32.setVisible(true);
        LTime.setVisible(false);
        LDate.setVisible(false);
    }

    //to show all the location button that part of visayas
    private void openV(){
        jRadioButton25.setVisible(true);
        jRadioButton34.setVisible(true);
        jRadioButton36.setVisible(true);
        jRadioButton37.setVisible(true);
        jRadioButton30.setVisible(true);
        jRadioButton38.setVisible(true);
        jRadioButton39.setVisible(true);
        jRadioButton40.setVisible(true);
        LTime.setVisible(true);
        LDate.setVisible(true);
    }
       //to show all the location button that part of mindanao
    private void openM(){
        jRadioButton41.setVisible(true);
        jRadioButton42.setVisible(true);
        jRadioButton43.setVisible(true);
        jRadioButton44.setVisible(true);
        jRadioButton45.setVisible(true);
        jRadioButton46.setVisible(true);
        jRadioButton47.setVisible(true);
        jRadioButton48.setVisible(true);
        LTime.setVisible(true);
        LDate.setVisible(true);
        
    }
    //to close all the button that part of Luzon
        private void closeL() {
        jRadioButton31.setVisible(false);
        jRadioButton33.setVisible(false);
        jRadioButton27.setVisible(false);
        jRadioButton28.setVisible(false);
        jRadioButton26.setVisible(false);
        jRadioButton29.setVisible(false);
        jRadioButton35.setVisible(false);
        jRadioButton32.setVisible(false);
    }
        //to close all the button that part of visayas
        private void closeV(){
        jRadioButton25.setVisible(false);
        jRadioButton34.setVisible(false);
        jRadioButton36.setVisible(false);
        jRadioButton37.setVisible(false);
        jRadioButton30.setVisible(false);
        jRadioButton38.setVisible(false);
        jRadioButton39.setVisible(false);
        jRadioButton40.setVisible(false);
}
        //to close all the button that part of mindanao
        private void closeM(){
        jRadioButton41.setVisible(false);
        jRadioButton42.setVisible(false);
        jRadioButton43.setVisible(false);
        jRadioButton44.setVisible(false);
        jRadioButton45.setVisible(false);
        jRadioButton46.setVisible(false);
        jRadioButton47.setVisible(false);
        jRadioButton48.setVisible(false);
        //jTextField2.setVisible(false);
        //jTextField4.setVisible(false);
        
}

        //dt function is used for creating a date of your program
        public void date() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        String dd = sdf.format(d);
        LDate.setText(dd);
    }
    //Timer is one of our import that located above
    Timer t;
    //also the SimpleDateFormat
    SimpleDateFormat st;

    public void time() {
        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                SimpleDateFormat st = new SimpleDateFormat("hh:mm:s a");
                String tt = st.format(dt);
                LTime.setText(tt);
            }
        });
        t.start();
    }

    //Create b1 - b24 to be executed at the jradiobutton
    public void b1() {
            wind = 11;
            tfah = 88;
            //using the formula of converting the fahrenhiet to celsius, we can get our tcel
            double tcel = ((5.0 / 9.0) * (tfah - 32));
            dpfah = 85;
            //using the formula of converting the fahrenhiet to celsius, we can get our tcel
            double dpcel = ((5.0 / 9.0) * (dpfah - 32));
            //using the formula on how to calculate relative humidity
            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));
                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
                //if the statement is false, it will go back to the calculation until it become true
              
            //call our date annd time function
            date();
            time();
            if (tcel > 0 && tcel < 15) {
                jTextField2.setText("Cold");
            } else if (tcel > 15 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 27) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
    }


    public void b2() {

            wind = 3;
             tfah = 89;
            double tcel = ((5.0 / 9.0) * (tfah - 32));
            dpfah = 87;
            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
                //if the statement is false, it will go back to the calculation until it become true
               
            //call our date annd time function
            date();
            time();
            //Make a if else statement for the decision
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }

        }

    public void b3() {
            wind = 10;
             tfah = 84;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 83;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
             
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b4() {
        wind = 7;
        
            tfah = 60;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 54;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
               
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }
    
    public void b5() {
            wind = 1;
            tfah = 80;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 79;

             double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
              
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b6() {
            wind = 5;
            tfah = 89;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 87;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            int relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
                
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b7() {
            wind = 3;
            tfah = 76;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 73;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));
                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
            
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");

            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b8() {       
            wind = 4;
            tfah = 60;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 55;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
             

            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    
    public void b9() {
            wind = 11;
            tfah = 90;
            //using the formula of converting the fahrenhiet to celsius, we can get our tcel
            double tcel = ((5.0 / 9.0) * (tfah - 32));
            dpfah = 85;
            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));
            
                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
              
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 27) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }

        }

    public void b10() {

            wind = 3;
             tfah = 60;
            double tcel = ((5.0 / 9.0) * (tfah - 32));
            dpfah = 54;
            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
               
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }

        }

    public void b11() {   
            wind = 10;
             tfah = 89;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 83;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));


                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
             
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b12() {
            wind = 7;
        
            tfah = 87;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 85;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
               
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }


    public void b13() {
            wind = 1;
            tfah = 83;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 79;

             double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
              
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b14() {
            wind = 5;
            tfah = 93;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 87;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            int relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                 jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
                
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b15() {        
            wind = 4;
            tfah = 79;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 67;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));
                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
            
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");

            } else {
                jTextField4.setText("Sunny");
            }
        }
    
    public void b16() {        
            wind = 8;
            tfah = 60;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 58;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
             

            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b17() {
            wind = 5;
            tfah = 80;
            double tcel = ((5.0 / 9.0) * (tfah - 32));
            dpfah = 80;
            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));
                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
              
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 27) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }

        }

    public void b18() {

            wind = 8;
             tfah = 59;
            double tcel = ((5.0 / 9.0) * (tfah - 32));
            dpfah = 55;
            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
               
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }

        }

    public void b19() {
            wind = 11;
             tfah = 88;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 83;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
             
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b20() {
            wind = 4;
        
            tfah = 89;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 86;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
               
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b21() {       
            wind = 1;
            tfah = 70;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 68;

             double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
              
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b22() {
            wind = 5;
            tfah = 87;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 75;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            int relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
                
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b23() {
            wind = 8;
            tfah = 75;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 73;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));

                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
            
            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");

            } else {
                jTextField4.setText("Sunny");
            }
        }

    public void b24() {
            wind = 2;
            tfah = 69;

            double tcel = ((5.0 / 9.0) * (tfah - 32));

            dpfah = 55;

            double dpcel = ((5.0 / 9.0) * (dpfah - 32));

            relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                    / Math.exp((17.625 * tcel) / (243.04 + tcel))));
                jLabel14.setText(tfah + "°fah");
                jLabel15.setText(tcel + "°cel");
                jLabel26.setText(dpfah + "°fah");
                jLabel31.setText(dpcel + "°cel");
                jLabel24.setText(relativeHumidity + "%");
                jLabel21.setText(wind + "km/h");
             

            date();
            time();
            if (tcel > 0 && tcel < 16) {
                jTextField2.setText("Cold");
            } else if (tcel > 16 && tcel < 25) {
                jTextField2.setText("Warm");
            } else if (tcel > 25 && tcel < 30) {
                jTextField2.setText("hot");
            } else if (tcel > 30 && tcel < 40) {
                jTextField2.setText("very hot");
            } else {
                jTextField2.setText("extremely hot");
            }
            if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
                jTextField4.setText("Rainy");
            } else {
                jTextField4.setText("Sunny");
            }
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        LTime = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        LDate = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();
        jRadioButton47 = new javax.swing.JRadioButton();
        jRadioButton48 = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        jScrollPane2.setViewportView(jTextPane2);

        jLabel17.setText("jLabel17");

        jLabel22.setText("jLabel22");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setSize(new java.awt.Dimension(200, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Weather Application");
        jLabel2.setMaximumSize(new java.awt.Dimension(350, 250));
        jLabel2.setMinimumSize(new java.awt.Dimension(19, 19));

        jTextField1.setAutoscrolls(false);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.setMaximumSize(new java.awt.Dimension(350, 250));
        jTextField1.setMinimumSize(new java.awt.Dimension(19, 19));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.setMaximumSize(new java.awt.Dimension(350, 250));
        jButton1.setMinimumSize(new java.awt.Dimension(19, 19));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Location:");
        jLabel3.setMaximumSize(new java.awt.Dimension(350, 250));
        jLabel3.setMinimumSize(new java.awt.Dimension(19, 19));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Fah:");
        jLabel12.setMaximumSize(new java.awt.Dimension(350, 250));
        jLabel12.setMinimumSize(new java.awt.Dimension(19, 19));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Cel:");
        jLabel13.setMaximumSize(new java.awt.Dimension(350, 250));
        jLabel13.setMinimumSize(new java.awt.Dimension(19, 19));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.setMaximumSize(new java.awt.Dimension(350, 250));
        jLabel14.setMinimumSize(new java.awt.Dimension(19, 19));

        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.setMaximumSize(new java.awt.Dimension(350, 250));
        jLabel15.setMinimumSize(new java.awt.Dimension(19, 19));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        LTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Date");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Previous days");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Time");

        LDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Wind:");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Hum:");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("fah:");

        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        jLabel27.setText("Luzon, Visayas, Mindanao");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Temperature");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Dew point");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("cel:");

        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(jRadioButton25);
        jRadioButton25.setText("Cebu");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton26);
        jRadioButton26.setText("Makati");
        jRadioButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton26ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton27);
        jRadioButton27.setText("Baguio");
        jRadioButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton27ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton28);
        jRadioButton28.setText("Batangas");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton29);
        jRadioButton29.setText("Tagaytay");
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton30);
        jRadioButton30.setText("Ormoc");
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton31);
        jRadioButton31.setText("Quizon");
        jRadioButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton31ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton32);
        jRadioButton32.setText("Intramuros");
        jRadioButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton32ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton33);
        jRadioButton33.setText("Manila");
        jRadioButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton33ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton34);
        jRadioButton34.setText("Lapu-Lapu");
        jRadioButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton34ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton35);
        jRadioButton35.setText("Vigan");
        jRadioButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton35ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton36);
        jRadioButton36.setText("Tacloban");
        jRadioButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton36ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton37);
        jRadioButton37.setText("Mandaue");
        jRadioButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton37ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton38);
        jRadioButton38.setText("Bohol");
        jRadioButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton38ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton39);
        jRadioButton39.setText("Borongan");
        jRadioButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton39ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton40);
        jRadioButton40.setText("Calbayog");
        jRadioButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton40ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton41);
        jRadioButton41.setText("Bukidnon");
        jRadioButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton41ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton42);
        jRadioButton42.setText("Davao");
        jRadioButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton42ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton43);
        jRadioButton43.setText("Iligan");
        jRadioButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton43ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton44);
        jRadioButton44.setText("Cotabato");
        jRadioButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton44ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton45);
        jRadioButton45.setText("Butuan");
        jRadioButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton45ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton46);
        jRadioButton46.setText("Valencia");
        jRadioButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton46ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton47);
        jRadioButton47.setText("Zamboanga");
        jRadioButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton47ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton48);
        jRadioButton48.setText("Digos");
        jRadioButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton48ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(jRadioButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRadioButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jRadioButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButton39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jRadioButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jRadioButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jRadioButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jRadioButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel29)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20))
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LTime, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LDate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jRadioButton33))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton27)
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton28)
                                            .addComponent(jRadioButton31))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton32)
                                            .addComponent(jRadioButton26))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton25)
                                            .addComponent(jRadioButton30))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jRadioButton36)
                                                    .addComponent(jRadioButton39)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jRadioButton34)
                                                .addComponent(jRadioButton38)))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton40)
                                            .addComponent(jRadioButton37))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton41)
                                            .addComponent(jRadioButton45))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jRadioButton43)
                                                    .addComponent(jRadioButton47)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jRadioButton42)
                                                .addComponent(jRadioButton46)))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton44)
                                            .addComponent(jRadioButton48)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LTime, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jRadioButton35)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(292, 292, 292)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //compare the user input and the String Peremeter if equal or not

        if (jTextField1.getText().equalsIgnoreCase("Luzon")) {
            //if equal execute the openL function
            openL();
            //to erase the user input if the last execution is done
            jTextField1.setText("");
            //to erase the curent forecast if the user will input another location
            erase();
            //to show the time and date
            LTime.setVisible(true);
            LDate.setVisible(true);
            //erase the the text inside the jTextField2 and jTextField3
            jTextField2.setText(" ");
            jTextField4.setText(" ");
            //to closed the button of visayas and Mindanao
            closeV();

        } else if (jTextField1.getText().equalsIgnoreCase("Visayas")) {
            openV();
            jTextField1.setText("");
            erase();
            LTime.setVisible(true);
            LDate.setVisible(true);
            jTextField2.setText(" ");
            jTextField4.setText(" ");
            closeL();
        } else if (jTextField1.getText().equalsIgnoreCase("Mindanao")) {
            openM();
            jTextField1.setText(" ");
            erase();
            LTime.setVisible(true);
            LDate.setVisible(true);
            jTextField2.setText(" ");
            jTextField4.setText(" ");
            closeL();
            closeV();
        } //if not equal, execute the button function and the label function and print Not found!!!
        else {
            jTextField2.setText(" ");
            jTextField4.setText(" ");
            erase();
           closeL();
           closeV();
           closeM();
            jTextField1.setText("NOT FOUND!!!");

        }
    }//GEN-LAST:event_jButton1ActionPerformed
//creating a new jFrame to a program and set visibl true to acces the previous days or to open the new jFrame
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        previous_days prev = new previous_days();
        prev.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
//Call all the button function that we made from b1-b24
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton33ActionPerformed
        b2();
    }//GEN-LAST:event_jRadioButton33ActionPerformed

    private void jRadioButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton31ActionPerformed
        b3();
    }//GEN-LAST:event_jRadioButton31ActionPerformed

    private void jRadioButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton27ActionPerformed
        b4();
    }//GEN-LAST:event_jRadioButton27ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        b1();
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton26ActionPerformed
        b7();
    }//GEN-LAST:event_jRadioButton26ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        b8();
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jRadioButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton35ActionPerformed
        b9();
    }//GEN-LAST:event_jRadioButton35ActionPerformed

    private void jRadioButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton32ActionPerformed
        b10();
    }//GEN-LAST:event_jRadioButton32ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        b11();
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton34ActionPerformed
        b12();
    }//GEN-LAST:event_jRadioButton34ActionPerformed

    private void jRadioButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton36ActionPerformed
        b13();
    }//GEN-LAST:event_jRadioButton36ActionPerformed

    private void jRadioButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton37ActionPerformed
        b14();
    }//GEN-LAST:event_jRadioButton37ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        b15();
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jRadioButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton38ActionPerformed
        b16();
    }//GEN-LAST:event_jRadioButton38ActionPerformed

    private void jRadioButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton39ActionPerformed
        b17();
    }//GEN-LAST:event_jRadioButton39ActionPerformed

    private void jRadioButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton40ActionPerformed
        b18();
    }//GEN-LAST:event_jRadioButton40ActionPerformed

    private void jRadioButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton41ActionPerformed
        b19();
    }//GEN-LAST:event_jRadioButton41ActionPerformed

    private void jRadioButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton42ActionPerformed
        b20();
    }//GEN-LAST:event_jRadioButton42ActionPerformed

    private void jRadioButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton43ActionPerformed
        b21();
    }//GEN-LAST:event_jRadioButton43ActionPerformed

    private void jRadioButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton44ActionPerformed
        b22();
    }//GEN-LAST:event_jRadioButton44ActionPerformed

    private void jRadioButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton45ActionPerformed
        b23();
    }//GEN-LAST:event_jRadioButton45ActionPerformed

    private void jRadioButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton46ActionPerformed
        b24();
    }//GEN-LAST:event_jRadioButton46ActionPerformed

    private void jRadioButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton47ActionPerformed
        b6();
    }//GEN-LAST:event_jRadioButton47ActionPerformed

    private void jRadioButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton48ActionPerformed
        b5();
    }//GEN-LAST:event_jRadioButton48ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Weather_forecast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Weather_forecast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Weather_forecast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Weather_forecast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Weather_forecast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LDate;
    private javax.swing.JLabel LTime;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton47;
    private javax.swing.JRadioButton jRadioButton48;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables

}