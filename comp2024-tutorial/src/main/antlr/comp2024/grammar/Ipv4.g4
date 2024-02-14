grammar Ipv4;

@header {
    package pt.up.fe.comp2024;
}

IP_N : [0-9]|[1-9][0-9]|'1'[0-9][0-9]|'2'[0-4][0-9]|'2''5'[0-5];


program :
    value += IP_N('.' value+=IP_N)*;

