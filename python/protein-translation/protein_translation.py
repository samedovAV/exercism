codon_table = {
    "AUG": "Methionine", "UUU": "Phenylalanine", "UUC": "Phenylalanine",
    "UUA": "Leucine", "UUG": "Leucine", "UCU": "Serine", "UCC": "Serine",
    "UCA": "Serine", "UCG": "Serine", "UAU": "Tyrosine", "UAC": "Tyrosine",
    "UGU": "Cysteine", "UGC": "Cysteine", "UGG": "Tryptophan",
    "UAA": "STOP", "UAG": "STOP", "UGA": "STOP",
}

def proteins(strand):
    protein_sequence = []
    i = 0
    while i < len(strand):
        codon = strand[i:i+3]
        amino_acid = codon_table.get(codon)
        if amino_acid == "STOP":
            break
        if amino_acid:
            protein_sequence.append(amino_acid)
        i += 3
    
    return protein_sequence