<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:01ababf1-49e0-4e38-bba3-6f204dbe34d4(ReferenceLanguage.intentions)">
  <persistence version="9" />
  <languages>
    <use id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions" version="1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="gu6h" ref="r:7832ba79-122e-452d-b064-5ac586f5bd58(ReferenceLanguage.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
    </language>
    <language id="d7a92d38-f7db-40d0-8431-763b0c3c9f20" name="jetbrains.mps.lang.intentions">
      <concept id="1192794744107" name="jetbrains.mps.lang.intentions.structure.IntentionDeclaration" flags="ig" index="2S6QgY" />
      <concept id="1192794782375" name="jetbrains.mps.lang.intentions.structure.DescriptionBlock" flags="in" index="2S6ZIM" />
      <concept id="1192795911897" name="jetbrains.mps.lang.intentions.structure.ExecuteBlock" flags="in" index="2Sbjvc" />
      <concept id="1192796902958" name="jetbrains.mps.lang.intentions.structure.ConceptFunctionParameter_node" flags="nn" index="2Sf5sV" />
      <concept id="2522969319638091381" name="jetbrains.mps.lang.intentions.structure.BaseIntentionDeclaration" flags="ig" index="2ZfUlf">
        <reference id="2522969319638198290" name="forConcept" index="2ZfgGC" />
        <child id="2522969319638198291" name="executeFunction" index="2ZfgGD" />
        <child id="2522969319638093993" name="descriptionFunction" index="2ZfVej" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1180636770613" name="jetbrains.mps.lang.smodel.structure.SNodeCreator" flags="nn" index="3zrR0B">
        <child id="1180636770616" name="createdType" index="3zrR0E" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2">
        <reference id="1138405853777" name="concept" index="ehGHo" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1160612413312" name="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" flags="nn" index="TSZUe" />
    </language>
  </registry>
  <node concept="2S6QgY" id="4C4v3YH97fY">
    <property role="TrG5h" value="addNewType" />
    <ref role="2ZfgGC" to="gu6h:1SVD7HlnzbC" resolve="Libraries" />
    <node concept="2S6ZIM" id="4C4v3YH97fZ" role="2ZfVej">
      <node concept="3clFbS" id="4C4v3YH97g0" role="2VODD2">
        <node concept="3clFbF" id="4C4v3YH97kW" role="3cqZAp">
          <node concept="Xl_RD" id="4C4v3YH97kV" role="3clFbG">
            <property role="Xl_RC" value="ADD NEW REFERENCE" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2Sbjvc" id="4C4v3YH97g1" role="2ZfgGD">
      <node concept="3clFbS" id="4C4v3YH97g2" role="2VODD2">
        <node concept="3cpWs8" id="4C4v3YH97pv" role="3cqZAp">
          <node concept="3cpWsn" id="4C4v3YH97py" role="3cpWs9">
            <property role="TrG5h" value="newNode" />
            <node concept="3Tqbb2" id="4C4v3YH97pu" role="1tU5fm">
              <ref role="ehGHo" to="gu6h:1SVD7HlnXkG" resolve="ReferenceType" />
            </node>
            <node concept="2ShNRf" id="4C4v3YH97ry" role="33vP2m">
              <node concept="3zrR0B" id="4C4v3YH98$7" role="2ShVmc">
                <node concept="3Tqbb2" id="4C4v3YH98$9" role="3zrR0E">
                  <ref role="ehGHo" to="gu6h:1SVD7HlnXkG" resolve="ReferenceType" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="4C4v3YH98_q" role="3cqZAp">
          <node concept="2OqwBi" id="4C4v3YH9aip" role="3clFbG">
            <node concept="2OqwBi" id="4C4v3YH98GC" role="2Oq$k0">
              <node concept="2Sf5sV" id="4C4v3YH98_p" role="2Oq$k0" />
              <node concept="3Tsc0h" id="4C4v3YH98UD" role="2OqNvi">
                <ref role="3TtcxE" to="gu6h:1SVD7HlnXkN" resolve="type" />
              </node>
            </node>
            <node concept="TSZUe" id="4C4v3YH9bXS" role="2OqNvi">
              <node concept="37vLTw" id="4C4v3YH9c7R" role="25WWJ7">
                <ref role="3cqZAo" node="4C4v3YH97py" resolve="newNode" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

