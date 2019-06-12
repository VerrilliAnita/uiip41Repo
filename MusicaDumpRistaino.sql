
INSERT INTO strumento (nome, categoria) VALUES
					('flauto', 'ottone'),
					('piano', 'corda'),
					('chitarra', 'corda'),
					('flauto traverso', 'ottone'),
					('batteria', 'ritmica'),
					('violino', 'corda'),
					('triangolo', 'ritmica'),
                    ('tamburo', 'ritmica');
                    
INSERT INTO musicista (codiceFiscale, nome, cognome, dataNascita, sesso) VALUES
				('ACLO34LOPOSIUYTD', 'Giuseppe', 'Ristaino', '1992/04/25', 'M'),
				('MRCT21CSTSRASDAD', 'Morich', 'Demoniaco', '1993/02/12', 'M'),
				('ADAS22SAYTCSTAFC', 'Adalgisa', 'Giacomini', '1992/09/01', 'F'),
				('DMA98ASCLSOUTGDP', 'Matteo', 'Don', '1991/08/22', 'M'),
				('GNC65LSDPLODUTRF', 'Giangiovanna', 'Rossettini','1989/01/21', 'F');
                
INSERT INTO abilita (musicista, strumento) VALUES
				('ACLO34LOPOSIUYTD', 'piano'),
				('ACLO34LOPOSIUYTD', 'flauto traverso'),
				('MRCT21CSTSRASDAD', 'triangolo'),
				('MRCT21CSTSRASDAD', 'tamburo'),
				('MRCT21CSTSRASDAD', 'batteria'),
				('MRCT21CSTSRASDAD', 'chitarra'),
				('MRCT21CSTSRASDAD', 'violino'),
				('ADAS22SAYTCSTAFC', 'chitarra'),
				('ADAS22SAYTCSTAFC', 'violino'),
				('DMA98ASCLSOUTGDP', 'piano'),
				('DMA98ASCLSOUTGDP', 'flauto traverso'),
				('DMA98ASCLSOUTGDP', 'batteria'),
				('GNC65LSDPLODUTRF', 'violino');