/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comparadordecodigo;

import java.util.StringTokenizer;

/**
 *
 * @author nando
 */
public class ContaPalavrasChaves {
    int cprivate=0;
    int cprotected=0;
    int cpublic=0;
    
    int cabstract=0;
    int cclass=0;
    int cextends=0;
    int cfinal=0;
    int cimplements=0;
    int cinterface=0;
    int cnative=0;
    int cnew=0;
    int cstatic=0;
    int cstrictfp=0;
    int csynchronized=0;
    int ctransient=0; 
    int cvolatile=0;
    
    int cint=0;
    int cstring=0;
    int cboolean=0;
    int cbyte=0;
    int cchar=0;
    int cdouble=0;
    int cfloat=0;
    int clong=0;
    int cshort=0;
    
    int cif=0;
    int cbreak=0;
    int ccase=0;
    int ccontinue=0;
    int cdefault=0;
    int cdo=0;
    int celse=0;
    int cfor=0;
    int cinstanceof=0;
    int creturn=0;
    int cswitch=0;
    int cwhile=0;
    
    int cassert=0;
    int ccatch=0;
    int cfinally=0;
    int cthrow=0;
    int cthrows=0;
    int ctry=0;
    
    int cimport=0;
    int cpackage=0;
    
    int csuper=0;
    int cthis=0;
    int cvoid=0;
    
    int csystemout=0;
    
      
    public void ContaPalavrasChaves(String codigo){
        /*Modificadores de acesso */
        String ma1 = "private ";
        String ma2 = "protected ";
        String ma3 = "public ";
        
        /*Modificadores de classes e variáveis */
        String mc1 = "abstract ";
        String mc2 = "class ";
        String mc3 = "extends ";
        String mc4 = "final ";
        String mc5 = "implements ";
        String mc6 = "interface ";
        String mc7 = "native ";
        String mc8 = "new ";
        String mc9 = "static ";
        String mc10 = "strictfp ";
        String mc11 = "synchronized ";
        String mc12 = "transient ";
        String mc13 = "volatile ";
        
        /*tipos primitivos */
        String tp1 = "int";
        String tp2 = "String";
        String tp3 = "boolean";
        String tp4 = "byte";
        String tp5 = "char";
        String tp6 = "double";
        String tp7 = "float";
        String tp8 = "long";
        String tp9 = "short";
        
        /*Controle de Fluxo */
        String cf1 = "if";
        String cf2 = "break";
        String cf3 = "case";
        String cf4 = "continue";
        String cf5 = "default";
        String cf6 = "do";
        String cf7 = "else";
        String cf8 = "for";
        String cf9 = "instanceof";
        String cf10 = "return";
        String cf11 = "switch";
        String cf12 = "while";
                
        /*Tratamento de Erro */
        String te1 = "assert";
        String te2 = "catch";
        String te3 = "finally";
        String te4 = "throw";
        String te5 = "throws";
        String te6 = "try";
        
        /*Controle de Pacotes*/
        String cp1 = "import ";
        String cp2 = "package ";
        
        /*Variáveis de Referência*/
        String vr1 = "super";
        String vr2 = "this";
        String vr3 = "void";
        
        /*Comandos para Impressao*/
        
        String ci1 = "System.out";
        
        
                
        for (int i = 0; i < codigo.length(); i++) {
            if (codigo.substring(i).startsWith(tp1)) {
                this.cint++;
            }
            
            if (codigo.substring(i).startsWith(tp2)) {
                this.cstring++;
            }
            
            if (codigo.substring(i).startsWith(tp3)) {
                this.cboolean++;
            }
            
            if (codigo.substring(i).startsWith(tp4)) {
                this.cbyte++;
            }
            
            if (codigo.substring(i).startsWith(tp5)) {
                this.cchar++;
            }
            
            if (codigo.substring(i).startsWith(tp6)) {
                this.cdouble++;
            }
            
            if (codigo.substring(i).startsWith(tp7)) {
                this.cfloat++;
            }
            
            if (codigo.substring(i).startsWith(tp8)) {
                this.clong++;
            }
            
            if (codigo.substring(i).startsWith(tp9)) {
                this.cshort++;
            }
            
            if (codigo.substring(i).startsWith(ma1)) {
                this.cprivate++;
            }
            
            if (codigo.substring(i).startsWith(ma2)) {
                this.cprotected++;
            }
            
            if (codigo.substring(i).startsWith(ma3)) {
                this.cpublic++;
            }
            
             if (codigo.substring(i).startsWith(mc1)) {
                this.cabstract++;
            }
            
            if (codigo.substring(i).startsWith(mc2)) {
                this.cclass++;
            }
            
            if (codigo.substring(i).startsWith(mc3)) {
                this.cextends++;
            } 
           
            if (codigo.substring(i).startsWith(mc4)) {
                this.cfinal++;
            }
            
            if (codigo.substring(i).startsWith(mc5)) {
                this.cimplements++;
            }
            
            if (codigo.substring(i).startsWith(mc6)) {
                this.cinterface++;
            }
            
            if (codigo.substring(i).startsWith(mc7)) {
                this.cnative++;
            }
            
            if (codigo.substring(i).startsWith(mc8)) {
                this.cnew++;
            }
            
            if (codigo.substring(i).startsWith(mc9)) {
                this.cstatic++;
            }
            
            if (codigo.substring(i).startsWith(mc10)) {
                this.cstrictfp++;
            }
            
            if (codigo.substring(i).startsWith(mc11)) {
                this.csynchronized++;
            }
            
            if (codigo.substring(i).startsWith(mc12)) {
                this.ctransient++;
            }
            
            if (codigo.substring(i).startsWith(mc13)) {
                this.cvolatile++;
            }
            
            if (codigo.substring(i).startsWith(cf1)) {
                this.cif++;
            }
            
            if (codigo.substring(i).startsWith(cf2)) {
                this.cbreak++;
            }
            
            if (codigo.substring(i).startsWith(cf3)) {
                this.ccase++;
            }
            
            if (codigo.substring(i).startsWith(cf4)) {
                this.ccontinue++;
            }
            
            if (codigo.substring(i).startsWith(cf5)) {
                this.cdefault++;
            }
            
            if (codigo.substring(i).startsWith(cf6)) {
                this.cdo++;
            }
            
            if (codigo.substring(i).startsWith(cf7)) {
                this.celse++;
            }
            
            if (codigo.substring(i).startsWith(cf8)) {
                this.cfor++;
            }
            
            if (codigo.substring(i).startsWith(cf9)) {
                this.cinstanceof++;
            }
            
            if (codigo.substring(i).startsWith(cf10)) {
                this.creturn++;
            }
            
            if (codigo.substring(i).startsWith(cf11)) {
                this.cswitch++;
            }
            
            if (codigo.substring(i).startsWith(cf12)) {
                this.cwhile++;
            }
            
            if (codigo.substring(i).startsWith(te1)) {
                this.cassert++;
            }
            
            if (codigo.substring(i).startsWith(te2)) {
                this.ccatch++;
            }
            
            if (codigo.substring(i).startsWith(te3)) {
                this.cfinally++;
            }
            
            if (codigo.substring(i).startsWith(te4)) {
                this.cthrow++;
            }
            
            if (codigo.substring(i).startsWith(te5)) {
                this.cthrows++;
                this.cthrow--;
            }
            
            if (codigo.substring(i).startsWith(te6)) {
                this.ctry++;
            }
            
            if (codigo.substring(i).startsWith(cp1)) {
                this.cimport++;
            }
            
            if (codigo.substring(i).startsWith(cp2)) {
                this.cpackage++;
            }
            
            if (codigo.substring(i).startsWith(vr1)) {
                this.csuper++;
            }
            
            if (codigo.substring(i).startsWith(vr2)) {
                this.cthis++;
            }
            
            if (codigo.substring(i).startsWith(vr3)) {
                this.cvoid++;
            }
            
            if (codigo.substring(i).startsWith(ci1)) {
                this.csystemout++;
            }
        }
            
    }
    
}
