class NiepoprawnaOcenaException extends Exception {
    public NiepoprawnaOcenaException(String message) {
        super(message); 
    }
}
public class Oceny {
    static void sprawdzOcene(int ocena) throws NiepoprawnaOcenaException {
        if (ocena < 2 || ocena > 5) { 
            throw new NiepoprawnaOcenaException(
                "ocena spoza zakresu 2-5: " + ocena); 
        }
    }
    public static void main(String[] args) {
        int[] oceny = {4, 7, 3, 1}; 
        int sprawdzone = 0; 
        int poprawne = 0; 
        for (int ocena : oceny) {
            try {
                sprawdzOcene(ocena);
                poprawne++;
                System.out.println("Ocena " + ocena + ": poprawna"); 
            } catch (NiepoprawnaOcenaException e) {
                System.out.println("Ocena " + ocena + ": błąd, " + e.getMessage()); 
            } finally {
                sprawdzone++; 
            }
        }
        System.out.println("Sprawdzono ocen: " + sprawdzone + ", poprawnych: " + poprawne);
    }
}