package weather_app;

public class previous_days extends javax.swing.JFrame {

    public static double tfah, tcel, dpfah, dpcel;
    int relativeHumidity, wind;

    public previous_days() {
        initComponents();
        closeL();
        closeV();
        closeM();
        closeLday1();
        closeLday2();
        closeVday1();
        closeVday2();
        closeMday1();
        closeMday2();
    }

    public void Sunday() {
        wind = 4;
        tfah = 60;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 55;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void sunday2() {
        wind = 6;
        tfah = 76;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 75;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void sunday3() {
        wind = 5;
        tfah = 79;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 75;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void sunday4() {
        wind = 3;
        tfah = 89;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 86;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void sunday5() {
        wind = 11;
        tfah = 90;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 88;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void sunday6() {
        wind = 7;
        tfah = 60;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 57;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void Monday() {
        wind = 4;
        tfah = 90;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 87;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void monday2() {
        wind = 2;
        tfah = 94;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 80;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void monday3() {
        wind = 7;
        tfah = 92;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 89;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }
    
    private void monday4() {
        wind = 5;
        tfah = 89;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 84;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void monday5() {
        wind = 6;
        tfah = 60;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 58;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void monday6() {
        wind = 4;
        tfah = 70;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 65;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void Tuesday() {
        wind = 4;
        tfah = 78;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 77;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void tuesday2() {
        wind = 7;
        tfah = 88;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 84;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void tuesday3() {
        wind = 3;
        tfah = 84;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 83;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void tuesday4() {
        wind = 1;
        tfah = 60;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 59;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void tuesday5() {
        wind = 9;
        tfah = 89;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 84;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void tuesday6() {
        wind = 3;
        tfah = 90;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 86;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    public void Wednesday() {
        wind = 4;
        tfah = 86;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 85;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void wednesday2() {
        wind = 2;
        tfah = 60;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 55;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void wednesday3() {
        wind = 6;
        tfah = 90;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 86;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void wednesday4() {
        wind = 8;
        tfah = 68;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 67;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void wednesday5() {
        wind = 2;
        tfah = 79;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 60;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void wednesday6() {
        wind = 10;
        tfah = 67;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 64;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void Thursday() {
        wind = 3;
        tfah = 60;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 59;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void thursday2() {
        wind = 10;
        tfah = 93;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 90;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void thursday3() {
        wind = 8;
        tfah = 92;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 90;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void thursday4() {
        wind = 7;
        tfah = 78;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 69;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void thursday5() {
        wind = 1;
        tfah = 89;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 86;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void thursday6() {
        wind = 3;
        tfah = 90;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 89;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void Friday() {
        wind = 1;
        tfah = 69;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 65;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void friday2() {
        wind = 8;
        tfah = 78;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 76;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void friday3() {
        wind = 6;
        tfah = 75;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 73;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void friday4() {
        wind = 2;
        tfah = 68;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 59;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void friday5() {
        wind = 5;
        tfah = 79;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 76;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void friday6() {
        wind = 8;
        tfah = 77;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 76;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void Saturday() {
        wind = 6;
        tfah = 88;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 87;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField4.setText("Rainy");
        } else {
            jTextField4.setText("Sunny");
        }
    }

    private void saturday2() {
        wind = 4;
        tfah = 79;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 77;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void saturday3() {
        wind = 8;
        tfah = 69;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 67;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void saturday4() {
        wind = 6;
        tfah = 65;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 64;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void saturday5() {
        wind = 6;
        tfah = 89;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 86;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void saturday6() {
        wind = 4;
        tfah = 89;

        double tcel = ((5.0 / 9.0) * (tfah - 32));

        dpfah = 80;

        double dpcel = ((5.0 / 9.0) * (dpfah - 32));

        relativeHumidity = (int) (100 * (Math.exp((17.625 * dpcel) / (243.04 + dpcel))
                / Math.exp((17.625 * tcel) / (243.04 + tcel))));

        jLabel7.setText(tfah + "°fah");
        jLabel8.setText(tcel + "°cel");
        jLabel12.setText(dpfah + "°fah");
        jLabel18.setText(dpcel + "°cel");
        jLabel14.setText(relativeHumidity + "%");
        jLabel19.setText(wind + "km/h");

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
        if (relativeHumidity > 98 && relativeHumidity < 100 || tcel > 0 && tcel < 16) {
            jTextField3.setText("Rainy");
        } else {
            jTextField3.setText("Sunny");
        }
    }

    private void openL() {
        jRadioButton1.setVisible(true);
        jRadioButton2.setVisible(true);

    }

    private void openV() {
        jRadioButton4.setVisible(true);
        jRadioButton5.setVisible(true);

    }

    private void openM() {
        jRadioButton7.setVisible(true);
        jRadioButton3.setVisible(true);

    }

    private void closeL() {
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);

    }

    private void closeV() {
        jRadioButton4.setVisible(false);
        jRadioButton5.setVisible(false);

    }

    private void closeM() {
        jRadioButton7.setVisible(false);
        jRadioButton3.setVisible(false);

    }

    private void openLday1() {
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
    }

    private void openLday2() {
        jButton8.setVisible(true);
        jButton10.setVisible(true);
        jButton11.setVisible(true);
        jButton12.setVisible(true);
        jButton13.setVisible(true);
        jButton17.setVisible(true);
        jButton18.setVisible(true);
    }

    private void openVday1() {
        jButton26.setVisible(true);
        jButton27.setVisible(true);
        jButton28.setVisible(true);
        jButton29.setVisible(true);
        jButton30.setVisible(true);
        jButton31.setVisible(true);
        jButton32.setVisible(true);
    }

    private void openVday2() {
        jButton33.setVisible(true);
        jButton34.setVisible(true);
        jButton35.setVisible(true);
        jButton36.setVisible(true);
        jButton37.setVisible(true);
        jButton38.setVisible(true);
        jButton39.setVisible(true);
    }

    private void openMday1() {
        jButton47.setVisible(true);
        jButton48.setVisible(true);
        jButton49.setVisible(true);
        jButton50.setVisible(true);
        jButton51.setVisible(true);
        jButton52.setVisible(true);
        jButton53.setVisible(true);
    }

    private void openMday2() {
        jButton54.setVisible(true);
        jButton55.setVisible(true);
        jButton56.setVisible(true);
        jButton57.setVisible(true);
        jButton58.setVisible(true);
        jButton59.setVisible(true);
        jButton60.setVisible(true);
    }

    private void closeLday1() {
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
    }

    private void closeLday2() {
        jButton8.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
        jButton12.setVisible(false);
        jButton13.setVisible(false);
        jButton17.setVisible(false);
        jButton18.setVisible(false);
    }

    private void closeVday1() {
        jButton26.setVisible(false);
        jButton27.setVisible(false);
        jButton28.setVisible(false);
        jButton29.setVisible(false);
        jButton30.setVisible(false);
        jButton31.setVisible(false);
        jButton32.setVisible(false);
    }

    private void closeVday2() {
        jButton33.setVisible(false);
        jButton34.setVisible(false);
        jButton35.setVisible(false);
        jButton36.setVisible(false);
        jButton37.setVisible(false);
        jButton38.setVisible(false);
        jButton39.setVisible(false);
    }

    private void closeMday1() {
        jButton47.setVisible(false);
        jButton48.setVisible(false);
        jButton49.setVisible(false);
        jButton50.setVisible(false);
        jButton51.setVisible(false);
        jButton52.setVisible(false);
        jButton53.setVisible(false);
    }

    private void closeMday2() {
        jButton54.setVisible(false);
        jButton55.setVisible(false);
        jButton56.setVisible(false);
        jButton57.setVisible(false);
        jButton58.setVisible(false);
        jButton59.setVisible(false);
        jButton60.setVisible(false);
    }

    //to erase the curent forecast if the user will change a location
    private void erase() {
        jLabel7.setText(" ");
        jLabel8.setText(" ");
        jLabel12.setText(" ");
        jLabel18.setText(" ");
        jLabel19.setText(" ");
        jLabel14.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jTextField4.setText("jTextField4");

        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton9.setText("jButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Previous Days");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Fah:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Cel:");

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Wind:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Fah:");

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Hum:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Temperature");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Dew point");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("cel:");

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton14.setText("Luzon");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton15.setText("Visayas");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton16.setText("Mindanao");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Manila");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Baguio");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Cebu");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Bohol");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Davao");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        jButton1.setText("SUN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MON");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("TUE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("WED");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("THU");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("FRI");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("SAT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("SUN");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setText("MON");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("TUE");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("WED");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("THU");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton17.setText("FRI");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("SAT");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton26.setText("THU");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("SUN");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("SAT");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("FRI");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText("TUE");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("WED");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("MON");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setText("TUE");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("SUN");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("FRI");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("THU");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("MON");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setText("SAT");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setText("WED");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton47.setText("THU");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setText("FRI");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setText("MON");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setText("WED");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setText("SUN");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jButton52.setText("SAT");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setText("TUE");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.setText("TUE");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setText("SAT");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.setText("FRI");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton57.setText("WED");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton58.setText("THU");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setText("MON");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton60.setText("SUN");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Butuan");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)))
                        .addGap(0, 0, 0)
                        .addComponent(jRadioButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton5)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(1, 1, 1)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton17)
                    .addComponent(jButton18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton32)
                    .addComponent(jButton30)
                    .addComponent(jButton31)
                    .addComponent(jButton26)
                    .addComponent(jButton29)
                    .addComponent(jButton28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton34)
                    .addComponent(jButton37)
                    .addComponent(jButton33)
                    .addComponent(jButton39)
                    .addComponent(jButton36)
                    .addComponent(jButton35)
                    .addComponent(jButton38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton51)
                    .addComponent(jButton49)
                    .addComponent(jButton53)
                    .addComponent(jButton50)
                    .addComponent(jButton47)
                    .addComponent(jButton48)
                    .addComponent(jButton52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton60)
                    .addComponent(jButton59)
                    .addComponent(jButton54)
                    .addComponent(jButton57)
                    .addComponent(jButton58)
                    .addComponent(jButton56)
                    .addComponent(jButton55))
                .addGap(64, 64, 64)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        openL();
        closeV();
        closeM();
        erase();
        closeLday1();
        closeLday2();
        closeVday1();
        closeVday2();
        closeMday1();
        closeMday2();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        openV();
        closeL();
        closeM();
        erase();
        closeLday1();
        closeLday2();
        closeVday1();
        closeVday2();
        closeMday1();
        closeMday2();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        openM();
        closeL();
        closeV();
        erase();
        closeLday1();
        closeLday2();
        closeVday1();
        closeVday2();
        closeMday1();
        closeMday2();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sunday();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Monday();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        sunday2();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        monday2();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        sunday3();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        monday3();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        sunday4();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        monday4();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        monday5();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        sunday5();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        monday6();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        sunday6();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        openLday1();
        closeLday2();

        closeVday1();
        closeVday2();

        closeMday1();
        closeMday2();
        erase();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        openVday1();
        closeLday1();
        closeLday2();

        closeVday2();

        closeMday1();
        closeMday2();
        erase();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        openLday2();
        closeLday1();

        closeVday1();
        closeVday2();

        closeMday1();
        closeMday2();
        erase();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        openVday2();
        closeVday1();
        closeLday1();
        closeLday2();
        closeMday1();
        closeMday2();
        erase();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Tuesday();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Wednesday();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Thursday();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Friday();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Saturday();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        tuesday2();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        wednesday2();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        thursday2();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        friday2();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        saturday2();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        tuesday3();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        wednesday3();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        thursday3();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        friday3();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        saturday3();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        tuesday4();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        wednesday4();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        thursday4();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        friday4();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        saturday4();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        tuesday5();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        wednesday5();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        thursday5();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        friday5();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        saturday5();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        tuesday6();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        wednesday6();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        thursday6();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        friday6();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        saturday6();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        openMday1();
        closeLday1();
        closeLday2();
        closeVday1();
        closeVday2();
        closeMday2();
        erase();
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        openMday2();
        closeLday1();
        closeLday2();
        closeVday1();
        closeVday2();
        closeMday1();
        erase();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(previous_days.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(previous_days.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(previous_days.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(previous_days.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new previous_days().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
