public class CalculoMedia {
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;


    //Set's das notas
    public void setNota1(int nota) {
        this.nota1 = nota;
    }

    public void setNota2(int nota) {
        this.nota2 = nota;
    }

    public void setNota3(int nota) {
        this.nota3 = nota;
    }
    public void setNota4(int nota) {
        this.nota4 = nota;
    }

    public int getNota1() {
        return nota1;
    }
    public int getNota2() {
        return nota2;
    }
    public int getNota3() {
        return nota3;
    }
    public int getNota4() {
        return nota4;
    }

    public double calcularMedia() {
        int total = nota1 + nota2 + nota3 + nota4;
        return (double) total/2;
    }
}


