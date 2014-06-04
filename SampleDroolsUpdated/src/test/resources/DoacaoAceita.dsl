[condition][]Verificar notificacao ativa =$n : Notificacao($o: Obito)
[condition][]e se Doacao foi aceita =$d: Doacao(obito == $o, autorizado == true)
[condition][]em um tempo limite de {timeStamp}=$d1: Doacao(this == $d, getDelayTime() < {timeStamp})

[consequence][]Display mensagem de sucesso = System.out.println("---> Doação Aceita! Avisar Banco de olhos! ");
[consequence][]Criar = Captacao captacao = new Captacao($d);
[consequence][]e Inserir uma Captacao  = insert(captacao);