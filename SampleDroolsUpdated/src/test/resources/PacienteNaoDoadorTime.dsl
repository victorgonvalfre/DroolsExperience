[condition][]Verificar notificacao ativa e =$n : ProcessoNotificacao($o: Obito, arquivado == false)
[condition][]validar se o tempo do processo já atingiu o limite de {timeStamp} horas=$n1: ProcessoNotificacao(this == $n, getDelayTime() < {timeStamp}*3600000) 

[consequence][]Display estouro de tempo do processo=System.out.println("---> O tempo do Processo já estourou! notificação de codigo: -----> "+ $n.getCodigo()+ " não pode ser tratado como possivel doador!");
[consequence][]Retira Notificacao do processo = retract($n)