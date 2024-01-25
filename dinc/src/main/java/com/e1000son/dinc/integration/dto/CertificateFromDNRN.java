package com.e1000son.dinc.integration.dto;

import java.sql.Timestamp;
import java.util.Date;

public class CertificateFromDNRN {
    private Long id;
    private String NUIC;
    private String Sexo;
    private Date DataNascimento;
    private String Provincia;
    private String Distrito;
    private String Localidade;
    private String NomeDoPai;
    private String NomeDaMae;
    private String[] Averbamentos;
    private Date DataEmissao;
    private Date DataRegisto;
    private String ConservatoriaRegisto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNUIC() {
        return NUIC;
    }

    public void setNUIC(String NUIC) {
        this.NUIC = NUIC;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String distrito) {
        Distrito = distrito;
    }

    public String getLocalidade() {
        return Localidade;
    }

    public void setLocalidade(String localidade) {
        Localidade = localidade;
    }

    public String getNomeDoPai() {
        return NomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        NomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return NomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        NomeDaMae = nomeDaMae;
    }

    public String[] getAverbamentos() {
        return Averbamentos;
    }

    public void setAverbamentos(String[] averbamentos) {
        Averbamentos = averbamentos;
    }

    public Date getDataEmissao() {
        return DataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        DataEmissao = dataEmissao;
    }

    public Date getDataRegisto() {
        return DataRegisto;
    }

    public void setDataRegisto(Date dataRegisto) {
        DataRegisto = dataRegisto;
    }

    public String getConservatoriaRegisto() {
        return ConservatoriaRegisto;
    }

    public void setConservatoriaRegisto(String conservatoriaRegisto) {
        ConservatoriaRegisto = conservatoriaRegisto;
    }
}
