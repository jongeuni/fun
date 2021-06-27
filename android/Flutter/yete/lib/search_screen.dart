import 'package:flutter/cupertino.dart';

class SearchScreen extends StatefulWidget{

  _SearchScreenState createState() => _SearchScreenState();

}

class _SearchScreenState extends State<SearchScreen>{
  final TextEditingController _filter = TextEditingController();
  FocusNode focusNode = FocusNode();
  String _searchText = "";

  _SearchScreenState(){
    _filter.addListener(() {
      setState(() {
        _searchText = _filter.text;
      });
    });
  }

  /*Widget _buildBody(BuildContext context){
    return StreamBuilder<QuerySnap>(builder:)
  }*/

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    throw UnimplementedError();
  }


}