[condition][]Verificar notificacao ativa =$n : Notificacao($o: Obito)
[condition][]e validar se o tempo do processo nao atingiu o limite de {timeStamp}=$n1: Notificacao(this == $n, getDelayTime() < {timeStamp}) 
[condition][]Examinar se obito = $o1: Obito(this == $o, $c: CausaMortis)
[condition][]não foi causado por doenca= $c1: CausaMortis(this == $c, tipoMorte == TipoMorte.Outros)

[consequence][]Display mensagem de aceite de paciente= System.out.println("---> Notificação de codigo: -----> "+ $n.getCodigo()+ " agendar entrevista, possivel doador!");
[consequence][]Criar e= Doacao doacao = new Doacao(true, null, $o1);
[consequence][]Agendar entrevista = insert(doacao);
