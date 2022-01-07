package com.github.leandroalcantara1997.api_agenda_salao.entitty;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.github.leandroalcantara1997.api_agenda_salao.utils.ValidaDados;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String sobrenome;
    private String cpf;
    private String rg;
    private Date data_nascimento;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente(String nome, String sobrenome, String cpf, String rg, String data_nascimento) throws Exception {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setCpf(cpf);
        this.setRg(rg);
        this.setData_nascimento(sdf.parse(data_nascimento));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        validaNome(nome);
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) throws Exception {
        System.out.println(sobrenome);
        validaSobrenome(sobrenome);
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        validaCPF(cpf);
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getData_nascimento() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data_nascimento);

    }

    public void setData_nascimento(Date data_nascimento) throws Exception {
        validaDataNascimento(data_nascimento);
        this.data_nascimento = data_nascimento;
    }

    private void validaNome(String nome) throws Exception {
        if (nome == "") {
            throw new Exception("Campo nome não pode estar vazio");
        } else if (ValidaDados.validaString(nome)) {
            throw new Exception("O campo nome não pode conter alfanumericos");
        }

    }

    private void validaSobrenome(String sobrenome) throws Exception {
        if (sobrenome == "") {
            throw new Exception("Campo sobrenome não pode estar vazio");
        } else if (ValidaDados.validaString(sobrenome)) {
            throw new Exception("O campo sobrenome não pode conter alfanumericos");
        }

    }

    private void validaCPF(String cpf) throws Exception {
        if (cpf == null) {
            throw new Exception("CPF nulo");
        }
        if (cpf.length() != 11) {
            throw new Exception("CPF deve conter 11 digitos");
        }

        if (ValidaDados.validaNumber(cpf)) {
        throw new Exception("CPF só pode conter digitos");
        }


    }

    private void validaDataNascimento(Date data_nascimento) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        ValidaDados.validaData(sdf.format(data_nascimento));
        Date now = new Date();
        if (now.compareTo(data_nascimento) < 0 || now.compareTo(data_nascimento) == 0) {
            throw new Exception("Data de nascimento deve ser posterior a atual");
        }
    }
}
