class StringArrayEquivalent{
    public boolean StringArrayEquivalent(String[] word1, String[] word2) {
                if((String.join("",word1)).equals(String.join("",word2))){
                    return true;
                }

                return false;
            }
        }
        
