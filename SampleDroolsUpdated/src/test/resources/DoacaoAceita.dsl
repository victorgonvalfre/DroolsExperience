[condition][]Validar notificacao =$n : Notificacao($o: Obito)
[condition][]Verificar se Doacao foi aceita =$d: Doacao(obito == $o, autorizado == true)
[condition][]Checkar time {timeStamp}=$d1: Doacao(this == $d, getDelayTime() < {timeStamp})

[consequence][]Display msgDoacaoTempoEsgotado=System.out.println("---> Doação Aceita! Avisar Banco de olhos! ");
[consequence][]Criar Captacao = Captacao captacao = new Captacao($d);
[consequence][]Inserir Captacao = insert(captacao);