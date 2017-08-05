import React, {Component} from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  TextInput,
  TouchableOpacity,
  Animated
} from 'react-native';
import Ionicons from 'react-native-vector-icons/Ionicons'


export default class App extends React.Component {

  render() {
    return (
      <Todo />
    );
  }
}

class Todo extends Component {
  
  
  constructor(props) {
    super(props);
    this.state = {
      x: new Animated.Value(100),
    };
  }
  click(){
    if(this.state.x._value == 100){
      Animated.spring(
        this.state.x,
        {toValue: 200}
      ).start();
    }
    else{
      Animated.timing(
        this.state.x,
        {toValue: 100}
      ).start();
    }

  }


  render() {
    return (
      <View style={styles.container}>
        <View style={{backgroundColor: '#FFAAAA', flex: 1}}>
          <View style={{position: 'absolute', backgroundColor: '#FFFFFF', right: 30, bottom: 30, height: 30, width: 30}}></View>
        </View>
        <View style={{flexDirection: 'row', flex: 1}}>
          <View style={{backgroundColor: '#FFAA00', flex: 1}}>
            <View style={{position: 'absolute', backgroundColor: '#FFFFFF', right: 30, bottom: 30, height: 30, width: 30}}></View>
          </View>
          <View style={{backgroundColor: '#00AAAA', flex: 1}}></View>
        </View>
        <View style={{backgroundColor: '#FF00AA', flex: 1}}>
          <View style={{position: 'absolute', backgroundColor: '#FFFFFF', right: 30, bottom: 30, height: 30, width: 30}}></View>
        </View>
        <TouchableOpacity onPress={this.click.bind(this)}>
          <Animated.View style={{position: 'absolute', backgroundColor: '#AAAAAA', right: this.state.x, bottom: 40, height: 30, width: 30}}></Animated.View>
        </TouchableOpacity>
      </View>
    );
  }

}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
});
