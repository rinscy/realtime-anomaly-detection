package bnouyrigat.h2o;

import java.util.Arrays;

public class ECGDataTestValues {

    public static double[] ANOMALY_DOUBLE_ARRAY = toDoubleArray(
            "5.16,5.15,5.14,5.14,5.16,5.17,5.15,5.14,5.13,5.13,5.11,5.10,5.10,5.10,5.11,5.09,5.08,5.09," +
                    "5.08,5.07,5.06,5.06,5.05,5.04,5.03,5.04,5.04,5.03,5.02,5.02,5.03,5.02,5.01,5.01,5.02,5.01,5.01,5.01," +
                    "5.02,5.02,5.01,5.00,5.02,5.01,5.00,5.00,5.01,5.01,5.01,5.00,5.01,5.03,5.03,5.04,5.19,5.27,5.91,5.62," +
                    "5.41,5.37,5.32,5.25,5.16,5.03,4.80,4.46,4.08,3.72,3.33,2.96,2.72,2.58,2.47,2.37,2.26,2.18,2.14,2.11," +
                    "2.08,2.07,2.08,2.07,2.06,2.07,2.12,2.19,2.28,2.44,2.65,2.87,3.15,3.51,3.85,4.14,4.43,4.72,4.98,5.18," +
                    "5.35,5.52,5.69,5.78,5.83,5.88,5.94,5.96,6.03,6.06,6.10,6.16,6.19,6.23,6.26,6.32,6.37,6.40,6.44,6.50," +
                    "6.54,6.58,6.63,6.70,6.73,6.76,6.81,6.86,6.91,6.93,6.95,6.98,6.99,7.01,7.02,7.03,7.02,7.00,6.96,6.92," +
                    "6.88,6.82,6.74,6.67,6.60,6.52,6.42,6.34,6.27,6.16,6.08,6.00,5.92,5.87,5.78,5.70,5.65,5.63,5.53,5.47," +
                    "5.43,5.40,5.35,5.32,5.29,5.27,5.24,5.20,5.19,5.19,5.18,5.15,5.13,5.13,5.13,5.11,5.10,5.10,5.11,5.10," +
                    "5.08,5.10,5.10,5.10,5.07,5.08,5.09,5.09,5.08,5.08,5.09,5.09,5.10,5.10,5.10,5.10,5.08,5.07,5.09,5.08," +
                    "5.08,5.07,5.07,5.08,5.07,5.06,5.05,5.05,5.06,5.04,5.03,5.03");

    public static double[] CONFORME_DOUBLE_ARRAY = toDoubleArray(
            "2.10,2.13,2.19,2.28,2.44,2.62,2.80,3.04,3.36,3.69,3.97,4.24,4.53,4.80,5.02,5.21,5.40,5.57,5.71," +
                    "5.79,5.86,5.92,5.98,6.02,6.06,6.08,6.14,6.18,6.22,6.27,6.32,6.35,6.38,6.45,6.49,6.53,6.57,6.64,6.70," +
                    "6.73,6.78,6.83,6.88,6.92,6.94,6.98,7.01,7.03,7.05,7.06,7.07,7.08,7.06,7.04,7.03,6.99,6.94,6.88,6.83," +
                    "6.77,6.69,6.60,6.53,6.45,6.36,6.27,6.19,6.11,6.03,5.94,5.88,5.81,5.75,5.68,5.62,5.61,5.54,5.49,5.45," +
                    "5.42,5.38,5.34,5.31,5.30,5.29,5.26,5.23,5.23,5.22,5.20,5.19,5.18,5.19,5.17,5.15,5.14,5.17,5.16,5.15," +
                    "5.15,5.15,5.14,5.14,5.14,5.15,5.14,5.14,5.13,5.15,5.15,5.15,5.14,5.16,5.15,5.15,5.14,5.14,5.15,5.15," +
                    "5.14,5.13,5.14,5.14,5.11,5.12,5.12,5.12,5.09,5.09,5.09,5.10,5.08,5.08,5.08,5.08,5.06,5.05,5.06,5.07," +
                    "5.05,5.03,5.03,5.04,5.03,5.01,5.01,5.02,5.01,5.01,5.00,5.00,5.02,5.01,4.98,5.00,5.00,5.00,4.99,5.00," +
                    "5.01,5.02,5.01,5.03,5.03,5.02,5.02,5.04,5.04,5.04,5.02,5.02,5.01,4.99,4.98,4.96,4.96,4.96,4.94,4.93," +
                    "4.93,4.93,4.93,4.93,5.02,5.27,5.80,5.94,5.58,5.39,5.32,5.25,5.21,5.13,4.97,4.71,4.39,4.05,3.69,3.32," +
                    "3.05,2.99,2.74,2.61,2.47,2.35,2.26,2.20,2.15,2.10,2.08"
    );

    public static double[] toDoubleArray(String data) {
        return Arrays.stream(data.split(","))
                .mapToDouble(Double::parseDouble)
                .toArray();
    }

}
