Alticci Sequence - Demonstration

Repo criado para teste técnico.

Como executar localmente via browser ou requisição HTTP:

Abra a IDE de sua escolha e execute o arquivo main "AlticciDemonstrationApplication". Após subir, a aplicação retornará a mensagem "Started AlticciDemonstrationApplication". Abra o browser de sua escolha e digite "localhost:8080/alticci/n" sendo "n" o índice da sequência que você deseja retornar. O mesmo é possível via Postman ou equivalente, desde que a aplicação esteja rodando localmente.

Como executar com Swagger: Siga os mesmos passos que antes mas troque a URL para "localhost:8080/swagger-ui.html". No Swagger haverá um diretório chamado "Controllers" e dentro dele estará o endpoint de acesso definido pelo o verbo HTTP GET: endpoint get /alticci/{n}. Ao clicar em "Try it Out" aparecerá o campo description, no qual você pode digitar o valor do índice para a sequência.

Como executar com Docker: Instale o Docker. Abra um terminal de comando do sistema operacional. Navegue até o diretório raiz do projeto e em seguida execute o comando para build "sudo docker build -t alticci-sequence ."Este comando irá criar a imagem Docker da aplicação. Para executar digite "sudo docker run alticci-sequence" e siga os passos anteriores via browser ou swagger para usar a aplicação.
