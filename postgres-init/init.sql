CREATE TABLE IF NOT EXISTS public.tb_logs
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    data timestamp(6) without time zone NOT NULL,
    request character varying(255) COLLATE pg_catalog."default",
    response character varying(255) COLLATE pg_catalog."default",
    mensagem character varying(255) COLLATE pg_catalog."default",
    tipo character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT tb_logs_pkey PRIMARY KEY (id),
    CONSTRAINT tb_logs_tipo_check CHECK (tipo::text = ANY (ARRAY['REQUEST'::character varying::text, 'RESPONSE'::character varying::text, 'ERROR'::character varying::text]))
);

CREATE TABLE IF NOT EXISTS public.tb_endereco
(
id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
rua character varying(100) COLLATE pg_catalog."default" NOT NULL,
numero character varying(50) COLLATE pg_catalog."default" NOT NULL,
bairro character varying(100) COLLATE pg_catalog."default" NOT NULL,
cidade character varying(50) COLLATE pg_catalog."default" NOT NULL,
estado character varying(50) COLLATE pg_catalog."default" NOT NULL,
cep character varying(10) COLLATE pg_catalog."default" NOT NULL,
CONSTRAINT tb_endereco_pkey PRIMARY KEY (id)
);
