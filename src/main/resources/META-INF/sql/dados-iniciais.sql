insert into ramo_atividade (id, descricao) values (1, 'Distribuição de alimentos');
insert into ramo_atividade (id, descricao) values (2, 'Telecomunicações');
insert into ramo_atividade (id, descricao) values (3, 'Vestuário');
insert into ramo_atividade (id, descricao) values (4, 'Lavanderia');
insert into ramo_atividade (id, descricao) values (5, 'Gráfica');
insert into ramo_atividade (id, descricao) values (6, 'Mecânica');
insert into ramo_atividade (id, descricao) values (7, 'Turismo');
insert into ramo_atividade (id, descricao) values (8, 'Saúde');
insert into ramo_atividade (id, descricao) values (9, 'Educação');
insert into ramo_atividade (id, descricao) values (10, 'Lazer');

insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) values (1, '70.311.193/0001-87', 'Mercado do João', 'João Mercado e Distribuidor de Alimentos Ltda', 'LTDA', DATE_SUB(NOW(), INTERVAL 9 YEAR), 1);
insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) values (2, '52.822.994/0001-25', 'Fale Mais', 'Fale Mais Telecom S.A.', 'SA', DATE_SUB(NOW(), INTERVAL 20 YEAR), 2);
insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) values (3, '41.952.519/0001-57', 'Maria de Souza da Silva', 'Maria de Souza da Silva', 'MEI', DATE_SUB(NOW(), INTERVAL 3 YEAR), 3);
insert into empresa (id, cnpj, nome_fantasia, razao_social, tipo, data_fundacao, ramo_atividade_id) values (4, '16.134.777/0001-89', 'Gomes Inovação', 'José Fernando Gomes EIRELI ME', 'EIRELI', DATE_SUB(NOW(), INTERVAL 12 YEAR), 4);