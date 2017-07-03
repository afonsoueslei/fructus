/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fructusDominio;

import java.time.LocalDate;

/**
 *
 * @author auf
 */
public class Usuario {
    
    //pessoal
    private Long id;
    private String nome;
    private String fotoPessoal;
    private EnumSexo sexo;
    private EnumEstadoCivil estadoCivil;    
    //Filiação;
    private String nomeDaMae;
    private String nomeDoPai;
    //Naturalidade
    private LocalDate dataDeNascimento;
    private String cidadeNascimento;
    private String estadoNascimento;
    //Endereco
    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private String CEP;
    //Nacionalidade e Identificação
    private EnumNacionalidade nacionalidade;
    private Integer numRG;
    private String orgaoExpedidor;
    private LocalDate dataExpedicao;
    private String cpf;
    private Integer numPassaporte;
    private LocalDate validadePassaporte;
    private Integer numRNE;
    private LocalDate validadeRNE;
    //Dados de contato
    private String telefonePrincipal;
    private String telefoneSecundario;
    private String email;
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFotoPessoal() {
        return fotoPessoal;
    }

    public void setFotoPessoal(String fotoPessoal) {
        this.fotoPessoal = fotoPessoal;
    }

    public EnumSexo getSexo() {
        return sexo;
    }

    public void setSexo(EnumSexo sexo) {
        this.sexo = sexo;
    }

    public EnumEstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EnumEstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getEstadoNascimento() {
        return estadoNascimento;
    }

    public void setEstadoNascimento(String estadoNascimento) {
        this.estadoNascimento = estadoNascimento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public EnumNacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(EnumNacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getNumRG() {
        return numRG;
    }

    public void setNumRG(Integer numRG) {
        this.numRG = numRG;
    }

    public String getOrgaoExpedidor() {
        return orgaoExpedidor;
    }

    public void setOrgaoExpedidor(String orgaoExpedidor) {
        this.orgaoExpedidor = orgaoExpedidor;
    }

    public LocalDate getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(LocalDate dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getNumPassaporte() {
        return numPassaporte;
    }

    public void setNumPassaporte(Integer numPassaporte) {
        this.numPassaporte = numPassaporte;
    }

    public LocalDate getValidadePassaporte() {
        return validadePassaporte;
    }

    public void setValidadePassaporte(LocalDate validadePassaporte) {
        this.validadePassaporte = validadePassaporte;
    }

    public Integer getNumRNE() {
        return numRNE;
    }

    public void setNumRNE(Integer numRNE) {
        this.numRNE = numRNE;
    }

    public LocalDate getValidadeRNE() {
        return validadeRNE;
    }

    public void setValidadeRNE(LocalDate validadeRNE) {
        this.validadeRNE = validadeRNE;
    }

    public String getTelefonePrincipal() {
        return telefonePrincipal;
    }

    public void setTelefonePrincipal(String telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }

    public String getTelefoneSecundario() {
        return telefoneSecundario;
    }

    public void setTelefoneSecundario(String telefoneSecundario) {
        this.telefoneSecundario = telefoneSecundario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
