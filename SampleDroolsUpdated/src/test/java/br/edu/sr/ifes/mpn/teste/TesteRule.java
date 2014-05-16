package br.edu.sr.ifes.mpn.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.edu.sr.ifes.mpn.model.*;
import br.edu.sr.ifes.mpn.util.LocalMorte;
import br.edu.sr.ifes.mpn.util.TipoMorte;

import org.junit.Before;
import org.junit.Test;

import br.edu.sr.ifes.seec.business.engine.RuleEngine;

public class TesteRule {

	private RuleEngine ruleEngine = new RuleEngine();
	
	@Before
	public void before()
	{
		ruleEngine.config("Rules.drl");
	}
	
	/*
	 * 
	 
	@Test
	public void testePacienteNaoDoador()
	{
       	Calendar cal = Calendar.getInstance();
    	
    	//Criando CausaMortis
    	CausaMortis causaMortis = new CausaMortis();
    	causaMortis.setTipoMorte(TipoMorte.DoencaContagiosa);
    	causaMortis.setDescricao("HIV");
    	
    	//Criando Obito
    	Obito obito = new Obito();
    	obito.setDataObito(cal.getTime());
    	obito.setCausaMortis(causaMortis);
    	
    	//Criando Notificao
        Notificacao notificaco = new Notificacao();
        notificaco.setCodigo("codigo1");
        notificaco.setDataNotificacao(cal.getTime());
        notificaco.setObito(obito);
		
		//Adiciono a objeto na sessao
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
	}
	
	*/
	@Test
	public void testePacienteDoador()
	{
		
       	Calendar cal = Calendar.getInstance();
       	Date dateAux = cal.getTime();
       	dateAux.setHours(dateAux.getHours()+1);
       	
    	//Criando CausaMortis
    	CausaMortis causaMortis = new CausaMortis();
    	causaMortis.setTipoMorte(TipoMorte.Outros);
    	causaMortis.setDescricao("Batida de Carro");
    	
    	//Criando Obito
    	Obito obito = new Obito();
    	obito.setDataObito(cal.getTime());
    	obito.setLocalMorte(LocalMorte.Vitoria);
    	obito.setCausaMortis(causaMortis);
    	
    	//Criando Notificao
        Notificacao notificaco = new Notificacao();
        notificaco.setCodigo("codigo2");
        notificaco.setDataNotificacao(dateAux);
        notificaco.setObito(obito);
        
	 	Instituicao instituicao1 = new Instituicao();
	 	instituicao1.setNome("Jayme");
	 	//instituicao1.setLstCaptacoesRelizadas(new ArrayList<Captacao>());
	 	instituicao1.setSigla("vix");
        
	 	Instituicao instituicao2 = new Instituicao();
	 	instituicao2.setNome("Jayme");
	 	//instituicao2.setLstCaptacoesRelizadas(new ArrayList<Captacao>());
	 	instituicao2.setSigla("vix");        
        
		//Adiciono a objeto na sessao
	 	ruleEngine.addObject(instituicao1);
	 	ruleEngine.addObject(instituicao2);
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
		
		System.out.println();
		System.out.println("-----> Instituição 1 - Lista de Captações:");
		for(int x = 0; x < instituicao1.getLstCaptacoesRelizadas().size(); x++){
			System.out.println(instituicao1.getLstCaptacoesRelizadas().get(x).toString());	
		}
		
		System.out.println();
		System.out.println("-----> Instituição 2 - Lista de Captações:");
		for(int x = 0; x < instituicao2.getLstCaptacoesRelizadas().size(); x++){
			System.out.println(instituicao1.getLstCaptacoesRelizadas().get(x).toString());	
		}
	}

	
	/*
	@Test
	public void testeDoacaoNegada()
	{
       	Calendar cal = Calendar.getInstance();
    	
    	//Criando CausaMortis
    	CausaMortis causaMortis = new CausaMortis();
    	causaMortis.setTipoMorte(TipoMorte.Outros);
    	causaMortis.setDescricao("Batida de Carro");
    	
    	//Criando Obito
    	Obito obito = new Obito();
    	obito.setDataObito(cal.getTime());
    	obito.setCausaMortis(causaMortis);
    	
    	//Criando Notificao
        Notificacao notificaco = new Notificacao();
        notificaco.setCodigo("codigo1");
        notificaco.setDataNotificacao(cal.getTime());
        notificaco.setObito(obito);
		
        //Criando Doacao
        Doacao doacao = new Doacao();
        doacao.setAutorizado(false);
        doacao.setMotivoRecusa(null);
        
		//Adiciono a objeto na sessao
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		ruleEngine.addObject(doacao);
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
	}
 

   
	@Test
	public void testeDoacaoAceita()
	{
       	Calendar cal = Calendar.getInstance();
    	
    	//Criando CausaMortis
    	CausaMortis causaMortis = new CausaMortis();
    	causaMortis.setTipoMorte(TipoMorte.Outros);
    	causaMortis.setDescricao("Batida de Carro");
    	
    	//Criando Obito
    	Obito obito = new Obito();
    	obito.setDataObito(cal.getTime());
    	obito.setCausaMortis(causaMortis);
    	
    	//Criando Notificao
        Notificacao notificaco = new Notificacao();
        notificaco.setCodigo("codigo2");
        notificaco.setDataNotificacao(cal.getTime());
        notificaco.setObito(obito);
		
        //Criando Doacao
        Doacao doacao = new Doacao();
        doacao.setAutorizado(true);
        doacao.setMotivoRecusa(null);
        
		//Adiciono a objeto na sessao
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		ruleEngine.addObject(doacao);
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
	}
	*/
	
	/*
	 * 
	 
	@Test
	public void testeColetaEmVitoria()
	{
       	Calendar cal = Calendar.getInstance();
    	

    	//Criando CausaMortis
    	CausaMortis causaMortis = new CausaMortis();
    	causaMortis.setTipoMorte(TipoMorte.Outros);
    	causaMortis.setDescricao("Batida de Carro");
    	
    	//Criando Obito
    	Obito obito = new Obito();
    	obito.setDataObito(cal.getTime());
    	obito.setCausaMortis(causaMortis);
    	obito.setLocalMorte(LocalMorte.Vitoria);
    	
    	//Criando Notificao
        Notificacao notificaco = new Notificacao();
        notificaco.setCodigo("codigo1");
        notificaco.setDataNotificacao(cal.getTime());
        notificaco.setObito(obito);
		
        //Criando Doacao
        Doacao doacao = new Doacao();
        doacao.setAutorizado(true);
        doacao.setObito(obito);
        doacao.setMotivoRecusa(null);
        
        //Criando Captacao
        Captacao captacao = new Captacao();
        captacao.setDoacao(doacao);
        
        
		//Adiciono a objeto na sessao
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		ruleEngine.addObject(doacao);
		ruleEngine.addObject(captacao);
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
	}
	
	
	@Test
	public void testeColetaEmOutros()
	{
       	Calendar cal = Calendar.getInstance();
    	
    	//Criando CausaMortis
    	CausaMortis causaMortis = new CausaMortis();
    	causaMortis.setTipoMorte(TipoMorte.Outros);
    	causaMortis.setDescricao("Batida de Carro");
    	
    	//Criando Obito
    	Obito obito = new Obito();
    	obito.setDataObito(cal.getTime());
    	obito.setCausaMortis(causaMortis);
    	obito.setLocalMorte(LocalMorte.Outros);
    	
    	//Criando Notificao
        Notificacao notificaco = new Notificacao();
        notificaco.setCodigo("codigo1");
        notificaco.setDataNotificacao(cal.getTime());
        notificaco.setObito(obito);
		
        //Criando Doacao
        Doacao doacao = new Doacao();
        doacao.setAutorizado(true);
        doacao.setObito(obito);
        doacao.setMotivoRecusa(null);
        
        //Criando Captacao
        Captacao captacao = new Captacao();
        captacao.setDoacao(doacao);

		//Adiciono a objeto na sessao
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		ruleEngine.addObject(doacao);
		ruleEngine.addObject(captacao);
		
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
	}
	
	@Test
	public void testeColetaEmOutrosPacienteComDoencaContagiosa()
	{
       	Calendar cal = Calendar.getInstance();
    	
    	//Criando CausaMortis
    	CausaMortis causaMortis = new CausaMortis();
    	causaMortis.setTipoMorte(TipoMorte.DoencaContagiosa);
    	causaMortis.setDescricao("HIV");
    	
    	//Criando Obito
    	Obito obito = new Obito();
    	obito.setDataObito(cal.getTime());
    	obito.setCausaMortis(causaMortis);
    	obito.setLocalMorte(LocalMorte.Outros);
    	
    	//Criando Notificao
        Notificacao notificaco = new Notificacao();
        notificaco.setCodigo("codigo1");
        notificaco.setDataNotificacao(cal.getTime());
        notificaco.setObito(obito);
		
        //Criando Doacao
        Doacao doacao = new Doacao();
        doacao.setAutorizado(true);
        doacao.setObito(obito);
        doacao.setMotivoRecusa(null);
        
        //Criando Captacao
        Captacao captacao = new Captacao();
        captacao.setDoacao(doacao);

		//Adiciono a objeto na sessao
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		ruleEngine.addObject(doacao);
		ruleEngine.addObject(captacao);
		
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
	}
	
	*/
}
