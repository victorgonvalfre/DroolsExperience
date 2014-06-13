[condition][]Verificar notificacao ativa =$n : ProcessoNotificacao($o: Obito, arquivado == false)
[condition][]com paciente apto para doacao = $o1: Obito(this == $o, aptoDoacao == true)
[condition][]e se Doacao foi aceita =$d: Doacao(obito == $o, autorizado == true)
[condition][]em um tempo limite de {timeStamp} horas=$d1: Doacao(this == $d, getDelayTime() < {timeStamp}*3600000)

[consequence][]Display mensagem de sucesso = System.out.println("---> Doação Aceita! Avisar Banco de olhos! ");
[consequence][]Criar = Captacao captacao = new Captacao($d);
[consequence][]e Inserir uma Captacao  = insert(captacao);