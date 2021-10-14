package demo;

public class Main {

    public static int max_zahl(int[] zahlen){
        int max = 0;

        //parcurgem array-ul si salvam max
        for (int a : zahlen){
            if (a > max){
                max = a;
            }
        }

        return max;
    }

    public static int min_zahl(int[] zahlen){
        int min = zahlen[0];

        //parcurgem array-ul si salvam min
        for (int i = 1; i < zahlen.length; i++){
            if (zahlen[i] < min){
                min = zahlen[i];
            }
        }

        return min;
    }

    public static int max_summe(int[] zahlen){
        int summe = 0;

        //pentru a gasi suma maxima a n-1 numere, trebuie sa nu adaugam min
        int min = min_zahl(zahlen);

        //folosim o variabila boolean pentru gasirea valorii de min
        boolean found = false;
        for (int a : zahlen){
            //parcurgem array-ul si adaugam numerele, in afara de un min
            if (a == min && !found){
                found = true;
                continue;
            }

            summe += a;
        }

        return summe;
    }

    public static int min_summe(int[] zahlen){
        int summe = 0;

        //pentru a gasi suma minima a n-1 numere, trebuie sa nu adaugam max
        int max = max_zahl(zahlen);

        //folosim o variabila boolean pentru gasirea valorii de max
        boolean found = false;
        for (int a : zahlen){
            //parcurgem array-ul si adaugam numerele, in afara de un max
            if (a == max && !found){
                found = true;
                continue;
            }

            summe += a;
        }

        return summe;
    }

    public static void main(String[] args) {
        int[] zahlen = new int[]{4, 8, 3, 10, 17};

        System.out.println("\nMax Zahl: " + String.valueOf(max_zahl(zahlen)));
        System.out.println("\nMin Zahl: " + String.valueOf(min_zahl(zahlen)));
        System.out.println("\nMax Summe: " + String.valueOf(max_summe(zahlen)));
        System.out.println("\nMin Summe: " + String.valueOf(min_summe(zahlen)));
    }
}
