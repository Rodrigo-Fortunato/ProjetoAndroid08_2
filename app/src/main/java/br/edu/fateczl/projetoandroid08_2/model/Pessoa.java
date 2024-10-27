package br.edu.fateczl.projetoandroid08_2.model;

import android.util.Log;
/*
 *@author:<Rodrigo Fortunato Martins Neves>
 */
public class Pessoa {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return  "Nome='" + nome + '\n' +
                ", CPF='" + cpf + '\n' ;
    }

    public String localRegistro() {
        String resultado = "";
        int digito = cpf.charAt(8)-48;
        Log.i("Digito", String.valueOf(digito));
        switch (digito) {
            case 0:
                resultado = "Rio Grande do Sul";
                break;
            case 1:
                resultado = "Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins";
                break;
            case 2:
                resultado = "Pará, Amazonas, Acre, Amapá, Rondônia e Roraima";
                break;
            case 3:
                resultado = "Ceará, Maranhão e Piauí";
                break;
            case 4:
                resultado = "Pernambuco, Rio Grande do Norte, Paraíba e Alagoas";
                break;
            case 5:
                resultado = "Bahia e Sergipe";
                break;
            case 6:
                resultado = "Minas Gerais";
                break;
            case 7:
                resultado = "Rio de Janeiro e Espírito Santo";
                break;
            case 8:
                resultado = "São Paulo";
                break;
            case 9:
                resultado = "Paraná e Santa Catarina";
                break;
            default:
                resultado="CPF Invalido";
        }

        return resultado;
    }

}
