package br.com.pi.the.icev.ed.exerciciopilhaq1.modelo;

public class Caminhao {
    private String placa;
    private boolean carregado;
    private float peso;
    private boolean perecivel;
    private String cpfMotorista;

    public Caminhao(String placa, boolean carregado, float peso, boolean perecivel, String cpfMotorista) {
        this.placa = placa;
        this.carregado = carregado;
        this.peso = peso;
        this.perecivel = perecivel;
        this.cpfMotorista = cpfMotorista;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isCarregado() {
        return carregado;
    }

    public void setCarregado(boolean carregado) {
        this.carregado = carregado;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }

    public String getCpfMotorista() {
        return cpfMotorista;
    }

    public void setCpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "placa='" + placa + '\'' +
                ", carregado=" + carregado +
                ", peso=" + peso +
                ", perecivel=" + perecivel +
                ", cpfMotorista='" + cpfMotorista + '\'' +
                '}';
    }
}
