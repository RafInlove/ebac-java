document.addEventListener('DOMContentLoaded', () => {
    const btnBuscarCep = document.getElementById('btn-buscar-cep');
    const inputCep = document.getElementById('CEP');
    const inputEndereco = document.getElementById('endereco');

    btnBuscarCep.addEventListener('click', async () => {
        const cep = inputCep.value.trim();

        if (cep === '') {
            alert('Por favor, insira um CEP válido.');
            return;
        }

        const endpoint = `https://viacep.com.br/ws/${cep}/json`;

        try {
            const response = await fetch(endpoint);

            if (!response.ok) {
                throw new Error('Erro ao buscar o CEP.');
            }

            const data = await response.json();

            if (data.erro) {
                alert('CEP não encontrado.');
                return;
            }

            const logradouro = data.logradouro;
            const bairro = data.bairro;
            const cidade = data.localidade;
            const estado = data.uf;
            const endereco = `${logradouro}, ${bairro} - ${cidade} - ${estado}`;

            inputEndereco.value = endereco;

        } catch (error) {
            console.error('Erro:', error);
            alert('Ocorreu um erro ao buscar o CEP. Tente novamente mais tarde.');
        }
    });
});
