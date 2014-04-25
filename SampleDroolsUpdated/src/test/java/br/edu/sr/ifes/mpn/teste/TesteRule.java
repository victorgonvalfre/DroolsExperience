package br.edu.sr.ifes.mpn.teste;

import java.util.Calendar;

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
	
	@Test
	public void testePacienteDoador()
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
		
		//Adiciono a objeto na sessao
		ruleEngine.addObject(causaMortis);
		ruleEngine.addObject(obito);
		ruleEngine.addObject(notificaco);
		//Disparar as regras
		ruleEngine.FireRules();
		//Liberar a sessao
		ruleEngine.dispose();
	}
	
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

	
}
