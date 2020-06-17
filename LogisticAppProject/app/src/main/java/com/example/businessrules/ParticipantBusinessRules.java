package com.example.businessrules;

import com.example.utilitiesdatabase.SQLiteConnectionHelper;
import com.example.utilitiesdatabase.UtilitiesParticipants;

public class ParticipantBusinessRules {
    public int ParticipantId;
    public String ParticipantIdentificationType;
    public String ParticipantIdentification;
    public String ParticipantName;
    public int TestId;

    UtilitiesParticipants _utilitiesParticipants = new UtilitiesParticipants();

    public int CountParticipantsBySite(SQLiteConnectionHelper conn){
        return _utilitiesParticipants.GetParticipantsBySite(conn).getCount();
    }
}
