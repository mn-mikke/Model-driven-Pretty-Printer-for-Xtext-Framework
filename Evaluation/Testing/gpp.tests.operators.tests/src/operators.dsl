enum blanks = {TAB, WS}

int MAX_ROW_SIZE = 80

poperator H[gpp.formatting.HorizontalOperatorImplementation]:
	   int     hs =  1
	{[blanks]} hc = WS
;

poperator V[gpp.formatting.VerticalOperatorImplementation]:
	int vs = 1
;

poperator A[gpp.formatting.TableOperatorImplementation]:
	   int     hs =  1
	{[blanks]} hc = WS
	   int     vs =  1
	{[blanks]} sc = WS
;

poperator R[gpp.formatting.RowOperatorImplementation];

poperator HV[gpp.formatting.HorizontalIfPossibleOperatorImplementation]:
	   int     hs =            1
	{[blanks]} hc =           WS
	   int     vs =            1
	   int     rs = MAX_ROW_SIZE
;

poperator HOV[gpp.formatting.HorizontalOrVerticalOperatorImplementation]:
	   int     hs =            1
	{[blanks]} hc =           WS
	   int     vs =            1
	   int     rs = MAX_ROW_SIZE
;

poperator I[gpp.formatting.IndentOperatorImplementation]:
	   int     is =   1
	{[blanks]} ic = TAB
;

poperator VI[gpp.formatting.VerticalIndentOperatorImplementation]:
	int ts = 1
	int bs = 1
;

hloperator F[gpp.highlighting.DefaultHighlightOperatorImplementation]:
	 {normal, bold}  w =     normal
	{normal, italic} i =     normal
	     string      c =  "#000000"
	     string      b =  "#ffffff"
	     string      f = "Consolas"
	      int        h =         10
;

toperator SC[gpp.formatting.SingleLineCommentFormattingOperatorImplementation]:
	 int   rs = MAX_ROW_SIZE
	string bs =         "//"
	string ws =          " "
;

toperator MC[gpp.formatting.MultiLineCommentFormattingOperatorImplementation]:
	 int   rs = MAX_ROW_SIZE
	string bs =         "/*"
	string is =         "  "
	string es =         "*/"
	string ws =          " "
;

toperator C[gpp.formatting.UniversalCommentFormattingOperatorImplementation];
