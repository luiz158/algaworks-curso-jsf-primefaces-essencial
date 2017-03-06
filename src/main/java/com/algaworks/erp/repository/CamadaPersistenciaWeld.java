package com.algaworks.erp.repository;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.algaworks.erp.model.Empresa;
import com.algaworks.erp.model.RamoAtividade;
import com.algaworks.erp.model.TipoEmpresa;
import com.algaworks.erp.service.CadastroEmpresaService;

public class CamadaPersistenciaWeld {
    
    public static void main(String[] args) throws Exception {
        // Para usar assim é preciso alterar o escopo do 
        // produtor de EntityManager de @RequestScoped
    	// para @ApplicationScoped dentro de EntityManagerProducer.
        
        WeldContainer weld = new Weld().initialize();
        
        CamadaPersistenciaWeld cp = weld.instance().select(CamadaPersistenciaWeld.class).get();
        cp.teste();  
        
        weld.close();
        System.out.println("Fim!");
    }

    @Inject
    private RamoAtividades ramoAtividades;
    
    @Inject
    private Empresas empresas;
    
    @Inject
    private CadastroEmpresaService cadastroEmpresaService;
    
    public void teste() throws Exception {       
        //Buscando as informações do banco
        List<RamoAtividade> listaDeRamoAtividades = ramoAtividades.pesquisar("");
        List<Empresa> listaDeEmpresas = empresas.pesquisar("");
        System.out.println(listaDeEmpresas);
        
        //Criando uma empresa
        Empresa empresa = new Empresa();        
        empresa.setNomeFantasia("João da Silva");
        empresa.setCnpj("41.952.519/0001-57");
        empresa.setRazaoSocial("João da Silva 41952519000157");
        empresa.setTipo(TipoEmpresa.MEI);
        //empresa.setDataFundacao(new Date());
        empresa.setRamoAtividade(listaDeRamoAtividades.get(0));
        
        //Salvando a empresa
        cadastroEmpresaService.salvar(empresa);
        
        //Verificando se a inserção funcionou
        List<Empresa> listaDeEmpresas2 = empresas.pesquisar("");
        System.out.println(listaDeEmpresas2);
    }
}